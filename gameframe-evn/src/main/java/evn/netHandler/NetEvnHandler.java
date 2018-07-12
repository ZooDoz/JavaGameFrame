package evn.netHandler;

import net.ctx.NetRequest;
import net.ctx.NetResponse;
import net.interfaces.EvnLoadHandler;

/**
 * @author zoodoz
 * create date 2018/7/3
 * 环境校验器
 */
public class NetEvnHandler implements EvnLoadHandler
{
    public boolean evnCheck(NetRequest request, NetResponse response) {
        return false;
    }
}
