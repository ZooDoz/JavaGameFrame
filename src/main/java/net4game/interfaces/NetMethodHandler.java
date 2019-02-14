package net4game.interfaces;

import net4game.ctx.NetRequest;
import net4game.ctx.NetResponse;

/**
 * @author zoodoz
 * create date 2018/7/3
 * 方法调用模块
 */
public interface NetMethodHandler
{
    void handler(NetRequest request , NetResponse response);
}
