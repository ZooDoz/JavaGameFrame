package com.example.gameframe.net.interfaces;

import com.example.gameframe.net.pojo.NetRegister;
/**
 * 注册器，返回一个注册实例
 * @author zoodoz
 *
 * @param <T>
 */
public interface  NetRegisterHandler <T extends NetRegister>
{
	T register(Object msg);
}
