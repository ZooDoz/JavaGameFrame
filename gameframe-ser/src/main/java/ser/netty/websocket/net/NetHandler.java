package ser.netty.websocket.net;

import ser.netty.websocket.WssRequest;
import ser.netty.websocket.WssResponse;

/**
 * @author zoodoz
 * create date 2018/5/9
 */
public interface NetHandler
{
    boolean verify(WssRequest req , WssResponse resp);
    void handle(WssRequest req , WssResponse resp);
}
