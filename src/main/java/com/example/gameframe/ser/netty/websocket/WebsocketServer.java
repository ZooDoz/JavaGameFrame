package com.example.gameframe.ser.netty.websocket;

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

public class WebsocketServer {
    
    private int port;
    private WsHandlerAdapter wsHandlerAdapter;
    
    public WebsocketServer(int port , WsHandlerAdapter wsh) {
        this.port = port;
        this.wsHandlerAdapter = wsh;
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
                                    //放入请求处理器
                                    WebsocketServerHandler wssh = new WebsocketServerHandler();
                                    //TODO 不应该new
                                    wssh.setWsHandlerAdapter(wsHandlerAdapter);
                                    ch.pipeline().addLast(wssh);
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