package net.interfaces;

import net.ctx.NetRequest;
import net.ctx.NetResponse;
import net.pojo.NetRegistrant;
/**
 * 注册器，返回一个注册实例
 * @author zoodoz
 *
 */
public interface NetRegisterHandler <R extends NetRegistrant>
{
	/**
	 * 根据数据获取注册人
	 */
	R register(NetRequest request , NetResponse response);
}
