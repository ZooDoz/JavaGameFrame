package com.example.gameframe.ser.netty.websocket;

import java.util.Map;

import com.example.gameframe.ctx.AbstractResponse;

public class WssResponse extends AbstractResponse
{
	private String json;
	/**
	 * 响应其他session的数据
	 */
	private Map<String , String> ress;

	public String getJson() {
		return json;
	}

	public void setJson(String json) {
		this.json = json;
	}

	public Map<String , String> getRess() {
		return ress;
	}

	public void setRess(Map<String , String> ress) {
		this.ress = ress;
	}
}
