package ser.netty.websocket;

import ctx.AbstractRequest;
import ser.netty.websocket.net.NetMsg;

public class WssRequest extends AbstractRequest
{
    private NetMsg msg;

    public NetMsg getMsg() {
        return msg;
    }

    public void setMsg(NetMsg msg) {
        this.msg = msg;
    }
}
