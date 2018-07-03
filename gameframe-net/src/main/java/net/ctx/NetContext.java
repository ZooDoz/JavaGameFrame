package net.ctx;

import ctx.AbstractContext;

public class NetContext extends AbstractContext<NetSession>
{

    public NetContext()
    {
        super();
    }

    public NetSession getSession(String wssId)
    {
        return this.ctxSin.get(wssId);
    }

    public void addSession(NetSession si)
    {
        this.ctxSin.put(si.getWssId() , si);
    }

    public void removeSession(NetSession si)
    {
        this.ctxSin.remove(si.getWssId());
    }
}

