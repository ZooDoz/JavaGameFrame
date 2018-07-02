package com.example.gameframe.ser.netty.discard;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
/**
 * 直接就抛弃连接
 */
public class DiscardServerHandler extends ChannelInboundHandlerAdapter 
{
	
    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception
    {
        //默认的没有释放资源，需要手动释放资源
        ((ByteBuf) msg).release();
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception 
    {
        //抛出异常
        cause.printStackTrace();
        ctx.close();
    }
}