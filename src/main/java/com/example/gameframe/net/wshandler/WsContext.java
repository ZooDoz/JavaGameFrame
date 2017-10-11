package com.example.gameframe.net.wshandler;

import com.example.gameframe.ser.ctx.AbstractContext;

public class WsContext extends AbstractContext<WsRequest , WsResponse>
{
	public WsContext(WsRequest rq, WsResponse rp) {
		super(rq, rp);
	}

}
