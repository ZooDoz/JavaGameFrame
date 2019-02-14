package net4game.ctx;

import ctx.AbstractContext;

public class NetContext extends AbstractContext<NetSession>
{

    public NetContext()
    {
        super();
    }

    public NetSession getSession(String id)
    {
        return this.ctxSin.get(id);
    }

    public void addSession(NetSession si)
    {
        this.ctxSin.put(si.getId() , si);
    }

    public void removeSession(NetSession si)
    {
        this.ctxSin.remove(si.getId());
    }
}

