package net.ctx;

import ctx.AbstractRequest;
import ser.netty.websocket.WssRequest;

public class NetRequest extends AbstractRequest<WssRequest>
{
	private NetSession ws;

	public NetSession getWs() {
		return ws;
	}

	public void setWs(NetSession ws) {
		this.ws = ws;
	}
}
