package com.example.gameframe.net.wshandler;

import com.example.gameframe.ser.netty.websocket.*;

/**
 * 
 * 这一层处理网络信息
 * 对参数进行解析和校验
 * 把解析后的参数向下传递
 * 根据返回数据进行(按需要注册)响应请求
 * @author zoodoz
 *
 */
public class WsHandlerAdapterHandler extends WsHandlerAdapter
{
	@Override
	public boolean verify(WssSession si, WssRequest req) {
		return false;
	}

	public void handler(WssSession si, WssRequest req, WssResponse resp) {

	}
}
