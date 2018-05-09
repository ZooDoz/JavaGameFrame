package com.example.gameframe.ser.netty.websocket;

import java.util.Map;

import com.example.gameframe.ctx.AbstractResponse;

public class WssResponse extends AbstractResponse
{
	/**
	 * 响应session的数据
	 */
	private Map<String , String> ress;

	public Map<String , String> getRess() {
		return ress;
	}

	public void setRess(Map<String , String> ress) {
		this.ress = ress;
	}
}
