package com.example.gameframe.ser.netty.websocket.net;

import com.example.gameframe.ser.netty.websocket.WssRequest;
import com.example.gameframe.ser.netty.websocket.WssResponse;

/**
 * @author zoodoz
 * create date 2018/5/9
 */
public interface NetHandler
{
    boolean verify(WssRequest req , WssResponse resp);
    void handle(WssRequest req , WssResponse resp);
}
