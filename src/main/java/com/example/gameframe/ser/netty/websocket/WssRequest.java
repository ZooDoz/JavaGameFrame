package com.example.gameframe.ser.netty.websocket;

import com.example.gameframe.ctx.AbstractRequest;
import com.example.gameframe.ser.netty.websocket.net.NetMsg;

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
