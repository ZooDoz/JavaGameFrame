package com.example.gameframe.ser.handler;

import com.example.gameframe.ser.ctx.Context;

/**
 * 基于接口和泛型
 * 处理器
 * @author zoodoz
 *
 */
public interface NetHandler <C extends Context>
{
	void handler(C ctx);
}
