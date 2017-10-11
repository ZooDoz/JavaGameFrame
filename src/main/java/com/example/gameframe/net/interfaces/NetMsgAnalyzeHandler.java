package com.example.gameframe.net.interfaces;

import com.example.gameframe.net.pojo.NetMsg;
import com.example.gameframe.ser.ctx.Request;
/**
 * 数据处理器，处理数据，传递到后续逻辑中使用
 * @author zoodoz
 *
 * @param <T>
 */
public interface NetMsgAnalyzeHandler <M extends NetMsg , Rq extends Request>
{
	M analyzeMsg(Rq msg);
}
