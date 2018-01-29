package com.example.gameframe.ser.ctx;

public abstract class AbstractRequest implements Request
{
	protected Object rq;

	public Object getRq() {
		return rq;
	}

	public void setRq(Object rq) {
		this.rq = rq;
	}
	
}
