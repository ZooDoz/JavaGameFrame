package com.example.gameframe.ser.netty.websocket;


public abstract class WsHandlerAdapter
{
	public abstract boolean verify(WssContext ctx);
	public abstract void handler(WssContext ctx);
}
