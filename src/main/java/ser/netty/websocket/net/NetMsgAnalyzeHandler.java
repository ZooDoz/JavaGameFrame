package ser.netty.websocket.net;

import ctx.Request;

/**
 * 数据处理器，处理数据，传递到后续逻辑中使用
 * @author zoodoz
 *
 */
public interface NetMsgAnalyzeHandler <Rq extends Request>
{
	void analyzeReq(Rq msg);
	void analyzeMsg(Rq msg);
}
