package com.example.gameframe.net.netty;

import static io.netty.handler.codec.http.HttpHeaders.Names.HOST;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.handler.codec.http.FullHttpRequest;
import io.netty.handler.codec.http.websocketx.TextWebSocketFrame;
import io.netty.handler.codec.http.websocketx.WebSocketServerHandshaker;
import io.netty.handler.codec.http.websocketx.WebSocketServerHandshakerFactory;

public class DiscardServerHandler extends SimpleChannelInboundHandler<Object> 
{
	
	@Override
	protected void channelRead0(ChannelHandlerContext ctx, Object msg) throws Exception 
	{
		if(msg instanceof FullHttpRequest)
		{
			String location = "ws://" + ((FullHttpRequest)msg).headers().get(HOST) + "/ws";
			WebSocketServerHandshakerFactory wsFactory = new WebSocketServerHandshakerFactory(location, null, true);
			WebSocketServerHandshaker handshaker = wsFactory.newHandshaker((FullHttpRequest)msg);
			handshaker.handshake(ctx.channel() , (FullHttpRequest)msg);
		}
		else if(msg instanceof TextWebSocketFrame)
		{
			String t = ((TextWebSocketFrame)msg).text();
			ctx.writeAndFlush(new TextWebSocketFrame(t));
		}
	}

}