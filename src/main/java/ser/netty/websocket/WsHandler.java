package ser.netty.websocket;

import ser.netty.websocket.net.NetHandler;
import ser.netty.websocket.net.NetMsgAnalyzeHandler;
import ser.netty.websocket.net.impl.DefualNetMessageAnalyzeHandler;

/**
 * @author zoodoz
 * create date 2018/5/9
 *
 * 注入解析器
 */
public class WsHandler
{
    private NetHandler netHandler;
    private NetMsgAnalyzeHandler netMsgAnalyzeHandler;


	boolean verify(WssRequest req, WssResponse resp)
    {
        this.netMsgAnalyzeHandler.analyzeReq(req);
        return this.netHandler.verify(req,resp);
    }

    void handle(WssRequest req, WssResponse resp)
    {
        this.netMsgAnalyzeHandler.analyzeMsg(req);
        this.netHandler.handle(req,resp);
    }

    public WsHandler(NetHandler netHandler) {
        this.netHandler = netHandler;
        this.netMsgAnalyzeHandler = new DefualNetMessageAnalyzeHandler();
    }

    public WsHandler(NetHandler netHandler, NetMsgAnalyzeHandler netMsgAnalyzeHandler) {
        this.netHandler = netHandler;
        this.netMsgAnalyzeHandler = netMsgAnalyzeHandler;
    }
}
