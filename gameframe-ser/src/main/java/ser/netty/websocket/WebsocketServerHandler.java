package ser.netty.websocket;

import static io.netty.handler.codec.http.HttpHeaders.Names.CONNECTION;
import static io.netty.handler.codec.http.HttpHeaders.Names.HOST;
import static io.netty.handler.codec.http.HttpHeaders.Names.UPGRADE;
import static io.netty.handler.codec.http.HttpMethod.GET;
import static io.netty.handler.codec.http.HttpResponseStatus.BAD_REQUEST;
import static io.netty.handler.codec.http.HttpResponseStatus.FORBIDDEN;
import static io.netty.handler.codec.http.HttpResponseStatus.NOT_FOUND;
import static io.netty.handler.codec.http.HttpResponseStatus.UNAUTHORIZED;
import static io.netty.handler.codec.http.HttpVersion.HTTP_1_1;

import java.util.Map;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.handler.codec.http.DefaultFullHttpResponse;
import io.netty.handler.codec.http.FullHttpRequest;
import io.netty.handler.codec.http.FullHttpResponse;
import io.netty.handler.codec.http.HttpHeaders;
import io.netty.handler.codec.http.websocketx.CloseWebSocketFrame;
import io.netty.handler.codec.http.websocketx.PingWebSocketFrame;
import io.netty.handler.codec.http.websocketx.PongWebSocketFrame;
import io.netty.handler.codec.http.websocketx.TextWebSocketFrame;
import io.netty.handler.codec.http.websocketx.WebSocketFrame;
import io.netty.handler.codec.http.websocketx.WebSocketServerHandshakerFactory;
import io.netty.util.CharsetUtil;
/**
 * 每一个请求都会生成一个handler
 * @author zoodoz
 *
 */
public class WebsocketServerHandler extends SimpleChannelInboundHandler<Object>
{
	private WsHandler wsHandler;
    private WssContext wssContext;
	private WssSession wsssi;

	public WebsocketServerHandler(WsHandler wsHandler , WssContext wssContext , WssSession wsssi) {
		this.wsHandler = wsHandler;
		this.wssContext = wssContext;
		this.wsssi = wsssi;
	}

	@Override
	protected void channelRead0(ChannelHandlerContext ctx, Object msg) throws Exception 
	{
		if(msg instanceof FullHttpRequest)
		{
			this.handleHttpRequest(ctx, (FullHttpRequest)msg);
		}
		else if(msg instanceof WebSocketFrame)
		{
			this.handleWebSocketFrame(ctx, (WebSocketFrame)msg);
		}
	}

	private void handleHttpRequest(ChannelHandlerContext ctx, FullHttpRequest req)
	{
		if (!req.getDecoderResult().isSuccess())
		{// Handle a bad request.
			sendHttpResponse(ctx, req, new DefaultFullHttpResponse(HTTP_1_1, BAD_REQUEST));
		}
		else if (req.getMethod() != GET)
		{// Allow only GET methods.
			sendHttpResponse(ctx, req, new DefaultFullHttpResponse(HTTP_1_1, FORBIDDEN));
		}
		else if ("/".equals(req.getUri()))
		{// Send the demo page and favicon.ico
			sendHttpResponse(ctx, req, new DefaultFullHttpResponse(HTTP_1_1, FORBIDDEN));
		}
		else if ("/favicon.ico".equals(req.getUri()))
		{
			FullHttpResponse res = new DefaultFullHttpResponse(HTTP_1_1, NOT_FOUND);
			sendHttpResponse(ctx, req, res);
		}
		else if (null != req.headers() && null != req.headers().get(CONNECTION) && req.headers().get(CONNECTION).contains(UPGRADE))
		{// Handshake
			//设置请求
			WssRequest wssrq = new WssRequest();
			wssrq.setOrq(req);
			//设置响应
			WssResponse wssrp = new WssResponse();
			//调用适配器校验登录态
			Boolean verify = this.wsHandler.verify(wssrq , wssrp);
			if(!verify)
				sendHttpResponse(ctx, req, new DefaultFullHttpResponse(HTTP_1_1, UNAUTHORIZED));
			else 
			{
			    //创建握手对象
				if (null == this.wsssi.getHandshaker())
				{
					String location = "ws://" + req.headers().get(HOST) + "/ws";
					WebSocketServerHandshakerFactory wsFactory = new WebSocketServerHandshakerFactory(location, null, true);
					this.wsssi.setHandshaker(wsFactory.newHandshaker(req));
				}
				//处理握手
				if (null == this.wsssi.getHandshaker())
					WebSocketServerHandshakerFactory.sendUnsupportedVersionResponse(ctx.channel());
				else
					this.wsssi.getHandshaker().handshake(ctx.channel(), req);

                this.wsssi.setChannel(ctx.channel());
                //成功后更新si的id
                wsssi.setId(wssrq.getSid());
				this.wssContext.addSession(wsssi);
			}
		} 
		else 
		{
			sendHttpResponse(ctx, req, new DefaultFullHttpResponse(HTTP_1_1, UNAUTHORIZED));
		}
	}
	
	private void handleWebSocketFrame(ChannelHandlerContext ctx, WebSocketFrame frame)
	{
		if (frame instanceof CloseWebSocketFrame)
		{
		    //关闭握手
			this.wsssi.getHandshaker().close(ctx.channel(), (CloseWebSocketFrame) frame.retain());
            this.wssContext.removeSession(this.wsssi);
			return;
		}
		else if (frame instanceof PingWebSocketFrame)
		{
			ctx.channel().write(new PongWebSocketFrame(frame.content().retain()));
			return;
		}
		else if(frame instanceof PongWebSocketFrame)
		{
			return;
		}
		else if(frame instanceof TextWebSocketFrame)
		{	
			//设置请求
			WssRequest wssrq = new WssRequest();
			wssrq.setOrq(frame);
			//设置当前缓存的唯一id
			wssrq.setSid(this.wsssi.getId());
			WssResponse wssrp = new WssResponse();
			//处理请求
			this.wsHandler.handle(wssrq , wssrp);

			for(Map.Entry<String , String> entry : wssrp.getRess().entrySet())
				wssContext.getSession(entry.getKey()).getChannel().writeAndFlush(entry.getKey());
		}
		else
		{
			throw new UnsupportedOperationException(String.format("%s frame types not supported", frame.getClass().getName()));
		}
	}

	private static void sendHttpResponse(ChannelHandlerContext ctx, FullHttpRequest req, FullHttpResponse res)
	{
		// Generate an error page if response getStatus code is not OK (200).
		if (res.getStatus().code() != 200)
		{
			ByteBuf buf = Unpooled.copiedBuffer(res.getStatus().toString(), CharsetUtil.UTF_8);
			res.content().writeBytes(buf);
			buf.release();
			HttpHeaders.setContentLength(res, res.content().readableBytes());
		}

		// Send the response and close the connection if necessary.
		ChannelFuture f = ctx.channel().writeAndFlush(res);
		if (!HttpHeaders.isKeepAlive(req) || res.getStatus().code() != 200)
		{
			f.addListener(ChannelFutureListener.CLOSE);
		}
	}
}