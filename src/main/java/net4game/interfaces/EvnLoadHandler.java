package net4game.interfaces;

import net4game.ctx.NetRequest;
import net4game.ctx.NetResponse;

/**
 * @author zoodoz
 * create date 2018/7/12
 * evn环境加载器
 */
public interface EvnLoadHandler
{
    /**
     * 注册环境check
     * @param request
     * @return
     */
    boolean evnCheck(NetRequest request , NetResponse response);
}
