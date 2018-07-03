package net.wshandler;

import net.ctx.NetContext;
import net.ctx.NetRequest;
import net.ctx.NetResponse;
import net.ctx.NetSession;
import net.interfaces.NetMethodHandler;
import net.interfaces.NetRegisterHandler;
import net.pojo.NetRegistrant;
import ser.netty.websocket.WssRequest;
import ser.netty.websocket.WssResponse;
import ser.netty.websocket.net.NetHandler;

/**
 * 
 * 这一层处理网络信息
 * 对参数进行解析和校验
 * 把解析后的参数向下传递
 * 根据返回数据进行(按需要注册)响应请求
 * @author zoodoz
 *
 */
public class WsNetHandler implements NetHandler
{
    private NetContext netContext;
	private NetRegisterHandler netRegisterHandler;
	private NetMethodHandler netMethodHandler;

	public boolean verify(WssRequest req, WssResponse resp)
    {
        NetRequest nreq = new NetRequest();
        NetResponse nresp = new NetResponse();
        if(this.netRegisterHandler.registCheck(nreq , nresp))
        {
            //注册玩家
            NetRegistrant r = this.netRegisterHandler.register(nreq , nresp);
            NetSession nssio = new NetSession();
            nssio.setR(r);
            this.netContext.addSession(nssio);
            //设置当前用户的sid
            req.setSid(r.getT());
        }
	    return false;
    }

	public void handle(WssRequest req, WssResponse resp)
    {
        //设置当前的环境
        NetRequest nreq = new NetRequest();
        NetSession nssio = this.netContext.getSession(req.getSid());
        nreq.setWs(nssio);

        NetResponse nresp = new NetResponse();

        this.netMethodHandler.handler(nreq , nresp);
	}
}
