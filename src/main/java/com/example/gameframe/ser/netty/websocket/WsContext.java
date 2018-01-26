package com.example.gameframe.ser.netty.websocket;

import com.example.gameframe.ser.ctx.AbstractContext;

public class WsContext extends AbstractContext<WsSession , WsRequest , WsResponse>
{
	public WsContext(WsSession ws , WsRequest rq, WsResponse rp) {
		super(ws , rq, rp);
	}

}
