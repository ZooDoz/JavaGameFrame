package com.example.gameframe.net.ctx;

import com.example.gameframe.ctx.Request;
public class WsRequest implements Request
{
	private WsSession ws;

	public WsSession getWs() {
		return ws;
	}

	public void setWs(WsSession ws) {
		this.ws = ws;
	}
}
