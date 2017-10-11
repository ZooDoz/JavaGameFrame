package com.example.gameframe.net.interfaces;

import com.example.gameframe.net.pojo.NetRegistrant;
import com.example.gameframe.ser.ctx.Request;
/**
 * 注册器，返回一个注册实例
 * @author zoodoz
 *
 * @param <T>
 */
public interface  NetRegisterHandler <R extends NetRegistrant , Rq extends Request>
{
	/**
	 * 根据数据获取注册人
	 * @param msg
	 * @return
	 */
	R register(Rq request);
}
