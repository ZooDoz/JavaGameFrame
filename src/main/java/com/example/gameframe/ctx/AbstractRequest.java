package com.example.gameframe.ctx;

/**
 * 请求的session
 */
public abstract class AbstractRequest implements Request
{
	/**
	 * 原始的rq对象
	 */
	protected Object rq;

	public Object getRq() {
		return rq;
	}

	public void setRq(Object rq) {
		this.rq = rq;
	}
	
}
