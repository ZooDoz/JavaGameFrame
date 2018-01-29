package com.example.gameframe.ser.netty.websocket;

import io.netty.handler.codec.http.FullHttpRequest;
import io.netty.handler.codec.http.websocketx.TextWebSocketFrame;

public abstract class WsHandlerAdapter
{
	public abstract boolean verify(FullHttpRequest rq);
	public abstract void handler(TextWebSocketFrame rq);
}
