package com.example.gameframe.ser.netty.websocket;

import io.netty.channel.ChannelHandlerContext;

import com.example.gameframe.ser.handler.NetHandler;

public abstract class WsHandlerAdapter implements NetHandler<WsContext>
{
	public abstract WsSession verify(WsRequest rq);
	public abstract void register(WsSession si , ChannelHandlerContext ctx);
	public abstract void handler(WsContext ctx);
}
