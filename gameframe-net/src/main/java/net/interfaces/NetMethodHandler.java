package net.interfaces;

import net.ctx.NetRequest;
import net.ctx.NetResponse;

/**
 * @author zoodoz
 * create date 2018/7/3
 * 方法调用模块
 */
public interface NetMethodHandler
{
    void handler(NetRequest request , NetResponse response);
}
