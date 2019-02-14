package net4game.interfaces;

import net4game.ctx.NetRequest;
import net4game.ctx.NetResponse;
import net4game.pojo.NetRegistrant;
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
