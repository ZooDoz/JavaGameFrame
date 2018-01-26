package com.example.gameframe.net.wshandler;

import java.util.UUID;

import io.netty.channel.ChannelHandlerContext;

import com.example.gameframe.ser.netty.websocket.WsContext;
import com.example.gameframe.ser.netty.websocket.WsHandlerAdapter;
import com.example.gameframe.ser.netty.websocket.WsRequest;
import com.example.gameframe.ser.netty.websocket.WsSession;

public class WsHandlerAdapterHandler extends WsHandlerAdapter
{

	@Override
	public WsSession verify(WsRequest rq) 
	{
		WsSession si = new WsSession();
		si.setId( UUID.randomUUID().toString());
		return si;
	}

	@Override
	public void register(WsSession si, ChannelHandlerContext ctx)
	{
		
	}

	@Override
	public void handler(WsContext ctx) 
	{
		System.out.println(ctx.getSession().toString());
	}

}
