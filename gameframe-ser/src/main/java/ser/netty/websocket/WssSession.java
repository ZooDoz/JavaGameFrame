package ser.netty.websocket;

import ctx.AbstractSession;
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


    WssSession(String id)
    {
        super(id);
    }

    Channel getChannel() {
        return channel;

    }
    void setChannel(Channel channel) {
        this.channel = channel;
    }

    WebSocketServerHandshaker getHandshaker() {
        return handshaker;
    }

    void setHandshaker(WebSocketServerHandshaker handshaker) {
        this.handshaker = handshaker;
    }

}
