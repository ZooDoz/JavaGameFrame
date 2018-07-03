package net.ctx;

import ctx.Request;

public class NetRequest implements Request
{
	private NetSession ws;

	public NetSession getWs() {
		return ws;
	}

	public void setWs(NetSession ws) {
		this.ws = ws;
	}
}
