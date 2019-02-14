package ser.netty.websocket;

import ctx.AbstractContext;

/**
 * 存储连接的容器
 * 管理所有活跃连接，可以推送到client
 */
public class WssContext extends AbstractContext<WssSession>
{

	WssContext()
	{
		super();
	}

	public WssSession getSession(String id)
	{
		return this.ctxSin.get(id);
	}

	public void addSession(WssSession si)
	{
		this.ctxSin.put(si.getId() , si);
	}

	public void removeSession(WssSession si)
	{
		this.ctxSin.remove(si.getId());
	}
}
