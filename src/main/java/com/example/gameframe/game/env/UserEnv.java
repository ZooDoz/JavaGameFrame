package com.example.gameframe.game.env;

import com.example.gameframe.net.pojo.NetRegistrant;

/**
 * 获取玩家evn接口
 * @author zoodoz
 * 这里集成了玩家的存储等信息
 */
public interface UserEnv<R extends NetRegistrant>
{
	/**
	 * 获取注册者
	 * @return
	 */
	R registrant();
	/**
	 * 根据注册者，注册环境
	 * @param r
	 */
	void register(R r);
}
