package com.example.gameframe.ctx;

import java.util.concurrent.ConcurrentHashMap;

/**
 *
 * @param <Si>
 * 存储了当前context的session集合
 */
public abstract class AbstractContext <Si extends Session> implements Context
{
	protected ConcurrentHashMap<String , Si> ctxSin;

	protected AbstractContext()
	{
		this.ctxSin = new ConcurrentHashMap<String, Si>();;
	}
}
