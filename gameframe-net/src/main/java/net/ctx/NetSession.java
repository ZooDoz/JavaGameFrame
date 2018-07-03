package net.ctx;

import ctx.Session;
import net.pojo.NetRegistrant;

public class NetSession implements Session
{
	private NetRegistrant r;

	public NetRegistrant getR() {
		return r;
	}

	public void setR(NetRegistrant r) {
		this.r = r;
	}
}
