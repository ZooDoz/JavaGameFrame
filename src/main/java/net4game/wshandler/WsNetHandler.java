package net4game.wshandler;

import net4game.ctx.NetContext;
import net4game.ctx.NetRequest;
import net4game.ctx.NetResponse;
import net4game.ctx.NetSession;
import net4game.interfaces.EvnLoadHandler;
import net4game.interfaces.NetMethodHandler;
import net4game.interfaces.NetRegisterHandler;
import net4game.pojo.NetRegistrant;
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
	private EvnLoadHandler evnLoadHandler;

	public boolean verify(WssRequest req, WssResponse resp)
    {
        NetRequest nreq = new NetRequest();
        nreq.setOrq(req);
        NetResponse nresp = new NetResponse();
        nresp.setOrp(resp);
        if(this.evnLoadHandler.evnCheck(nreq , nresp))
        {
            //注册玩家
            NetRegistrant r = this.netRegisterHandler.register(nreq , nresp);
            nreq.setSid(r.getId());
            NetSession nssio = new NetSession(nreq.getSid(), r);
            this.netContext.addSession(nssio);
            //设置当前用户的sid
            req.setSid(r.getId());
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
