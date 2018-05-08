package com.example.gameframe.ctx;

/**
 * 响应对象
 */
public abstract class AbstractResponse implements Response
{
	/**
	 * 原始的res对象
	 */
	private Object res;

	public Object getRes() {
		return res;
	}

	public void setRes(Object res) {
		this.res = res;
	}

}
