package com.example.gameframe.ser.netty.websocket;

import com.example.gameframe.ctx.AbstractContext;

public class WssContext extends AbstractContext<WssSession>
{

	public WssContext()
	{
		super();
	}

	public WssSession getSession(String id)
	{
		return this.ctxSin.get(id);
	}

	public void addSession(WssSession si)
	{
		this.ctxSin.put(si.getId() , si);
	}

	public void removeSession(WssSession si)
	{
		this.ctxSin.remove(si.getId());
	}
}
