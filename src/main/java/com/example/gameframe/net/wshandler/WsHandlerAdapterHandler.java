package com.example.gameframe.net.wshandler;

import io.netty.handler.codec.http.FullHttpRequest;
import io.netty.handler.codec.http.websocketx.TextWebSocketFrame;

import com.example.gameframe.ser.netty.websocket.WsHandlerAdapter;

public class WsHandlerAdapterHandler extends WsHandlerAdapter
{

	/**
	 * 校验注册
	 */
	@Override
	public boolean verify(FullHttpRequest rq) {
		// TODO Auto-generated method stub
		return false;
	}

	/**
	 * 处理请求
	 */
	@Override
	public void handler(TextWebSocketFrame rq) {
		// TODO Auto-generated method stub
		
	}
}
