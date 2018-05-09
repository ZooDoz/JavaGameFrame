package com.example.gameframe.net.wshandler;

import com.example.gameframe.ser.netty.websocket.WssRequest;
import com.example.gameframe.ser.netty.websocket.WssResponse;
import com.example.gameframe.ser.netty.websocket.net.NetHandler;

/**
 * 
 * 这一层处理网络信息
 * 对参数进行解析和校验
 * 把解析后的参数向下传递
 * 根据返回数据进行(按需要注册)响应请求
 * @author zoodoz
 *
 */
public class WsNetHandler implements NetHandler
{


	public boolean verify(WssRequest req, WssResponse resp)
    {

		return false;
	}

	public void handle(WssRequest req, WssResponse resp)
    {

	}
}
