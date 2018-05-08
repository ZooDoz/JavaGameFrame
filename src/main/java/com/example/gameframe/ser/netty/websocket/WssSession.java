package com.example.gameframe.ser.netty.websocket;

import com.example.gameframe.ctx.AbstractSession;
import io.netty.channel.Channel;
import io.netty.handler.codec.http.websocketx.WebSocketServerHandshaker;

/**
 * wss的session
 * 保存有用的连接信息
 */
public class WssSession extends AbstractSession
{
    /**
     * 握手对象
     */
    private WebSocketServerHandshaker handshaker;
    /**
     * 当前连接的channel
     */
    private Channel channel;


    public WssSession(String id)
    {
        super(id);
    }

    public Channel getChannel() {
        return channel;

    }
    public void setChannel(Channel channel) {
        this.channel = channel;
    }

    public WebSocketServerHandshaker getHandshaker() {
        return handshaker;
    }

    public void setHandshaker(WebSocketServerHandshaker handshaker) {
        this.handshaker = handshaker;
    }

}
