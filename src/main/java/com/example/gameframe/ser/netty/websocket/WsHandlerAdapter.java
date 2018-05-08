package com.example.gameframe.ser.netty.websocket;


public abstract class WsHandlerAdapter
{
	public abstract boolean verify(WssSession si , WssRequest req);
	public abstract void handler(WssSession si , WssRequest req , WssResponse resp);
}
