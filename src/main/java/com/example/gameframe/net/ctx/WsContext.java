package com.example.gameframe.net.ctx;

import com.example.gameframe.ctx.AbstractContext;

public class WsContext extends AbstractContext<WsSession , WsRequest , WsResponse>
{
	public WsContext(WsSession ws ,WsRequest rq, WsResponse rp) 
	{
		super(ws , rq, rp);
	}

}
