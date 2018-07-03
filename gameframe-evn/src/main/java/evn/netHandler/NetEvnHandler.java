package evn.netHandler;

import evn.EvnMethodHandler;
import evn.pojo.Registrant;
import net.ctx.NetRequest;
import net.ctx.NetResponse;
import net.interfaces.NetMethodHandler;
import net.interfaces.NetRegisterHandler;

/**
 * @author zoodoz
 * create date 2018/7/3
 */
public abstract class NetEvnHandler implements NetRegisterHandler<Registrant> , NetMethodHandler
{
    private EvnMethodHandler evnMethodHandler;

    public boolean registCheck(NetRequest request, NetResponse response) {
        return false;
    }

    public Registrant register(NetRequest request, NetResponse response) {
        return null;
    }

    public void handler(NetRequest request, NetResponse response) {

    }
}
