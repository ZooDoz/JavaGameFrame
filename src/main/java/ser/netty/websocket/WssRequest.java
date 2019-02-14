package ser.netty.websocket;

import ctx.AbstractRequest;
import ser.netty.websocket.net.NetMsg;

public class WssRequest extends AbstractRequest
{
    private NetMsg msg;
    private Object brq;

    public Object getBrq() {
        return brq;
    }

    public void setBrq(Object brq) {
        this.brq = brq;
    }

    public NetMsg getMsg() {
        return msg;
    }

    public void setMsg(NetMsg msg) {
        this.msg = msg;
    }
}
