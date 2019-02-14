package evn.netHandler;

import net4game.ctx.NetRequest;
import net4game.ctx.NetResponse;
import net4game.interfaces.EvnLoadHandler;

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
