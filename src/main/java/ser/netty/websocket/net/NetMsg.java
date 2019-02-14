package ser.netty.websocket.net;

import java.util.Map;
/**
 * 一个net请求的解析结果
 * @author zoodoz
 *
 */
public class NetMsg
{
	private Map<String , String> msg;

	public Map<String, String> getMsg() {
		return msg;
	}

	public void setMsg(Map<String, String> msg) {
		this.msg = msg;
	}
}
