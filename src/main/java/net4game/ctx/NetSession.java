package net4game.ctx;

import ctx.AbstractSession;
import net4game.pojo.NetRegistrant;

public class NetSession extends AbstractSession
{
	private NetRegistrant r;

	public NetSession(String id, NetRegistrant r)
	{
		super(id);
		this.r = r;
	}

	public NetRegistrant getR() {
		return r;
	}

	public void setR(NetRegistrant r) {
		this.r = r;
	}
}
