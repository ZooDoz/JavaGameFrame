package com.example.gameframe.ser.ctx;

public abstract class AbstractSession implements Session
{
	protected String host;

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}
	
}
