package com.example.gameframe.ser.netty.websocket;

import com.example.gameframe.ctx.AbstractContext;

public class WssContext extends AbstractContext<WssSession, WssRequest, WssResponse>
{

	public WssContext(WssSession si, WssRequest rq, WssResponse rp) 
	{
		super(si, rq, rp);
	}

}
