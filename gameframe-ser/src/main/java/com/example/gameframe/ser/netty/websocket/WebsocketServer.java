package com.example.gameframe.ser.netty.websocket;

import main.java.com.example.gameframe.net.wshandler.WsNetHandler;
import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.handler.codec.http.HttpObjectAggregator;
import io.netty.handler.codec.http.HttpServerCodec;

import java.util.UUID;

public class WebsocketServer {
    
    private int port;
    private WsHandler wsHandler;
    private WssContext wssContext;
    
    public WebsocketServer(int port , WsNetHandler wnsh) {

        this.port = port;
        this.wsHandler = new WsHandler(wnsh);
        this.wssContext = new WssContext();
    }
    
    public void run() throws Exception {
        EventLoopGroup bossGroup = new NioEventLoopGroup();
        EventLoopGroup workerGroup = new NioEventLoopGroup();
        try {
            ServerBootstrap b = new ServerBootstrap();
            b.group(bossGroup, workerGroup)
             .channel(NioServerSocketChannel.class)
             .childHandler(
                            //放入模版channel
                            new ChannelInitializer<SocketChannel>() 
                            {
                                @Override
                                public void initChannel(SocketChannel ch) throws Exception {
                                    //加入解码器 
                                    ch.pipeline().addLast(new HttpServerCodec());
                                    //设置请求长度
                                    ch.pipeline().addLast(new HttpObjectAggregator(65536));
                                    //设置session
                                    WssSession wssi = new WssSession(UUID.randomUUID().toString());
                                    //放入请求处理器
                                    //利用net层的处理器，初始化请求处理器
                                    //来对请求处理器提供服务
                                    //加入处理器
                                    ch.pipeline().addLast(new WebsocketServerHandler(wsHandler , wssContext , wssi));
                                }
                            })
             .option(ChannelOption.SO_BACKLOG, 128)         
             .childOption(ChannelOption.SO_KEEPALIVE, true);
    
            // Bind and start to accept incoming connections.
            ChannelFuture f = b.bind(port).sync();
    
            // Wait until the server socket is closed.
            // In this example, this does not happen, but you can do that to gracefully
            // shut down your server.
            f.channel().closeFuture().sync();
        } finally {
            workerGroup.shutdownGracefully();
            bossGroup.shutdownGracefully();
        }
    }
}