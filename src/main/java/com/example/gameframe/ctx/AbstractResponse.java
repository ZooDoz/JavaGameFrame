package com.example.gameframe.ctx;

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
