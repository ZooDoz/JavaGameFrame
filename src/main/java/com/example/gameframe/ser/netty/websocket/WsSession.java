package com.example.gameframe.ser.netty.websocket;

import com.example.gameframe.ser.ctx.Session;

public class WsSession extends Session {

	private String un;

	public String getUn() {
		return un;
	}
	public void setUn(String un) {
		this.un = un;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((un == null) ? 0 : un.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		WsSession other = (WsSession) obj;
		if (un == null) {
			if (other.un != null)
				return false;
		} else if (!un.equals(other.un))
			return false;
		return true;
	}
}
