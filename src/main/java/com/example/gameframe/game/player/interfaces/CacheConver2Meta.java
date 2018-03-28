package com.example.gameframe.game.player.interfaces;

import com.example.gameframe.game.player.base.PlayerBaseMeta;

/**
 * 每个模块都需要实现
 * 转换存储bean到游戏使用的meta
 * @author zoodoz
 *
 */
public interface CacheConver2Meta 
{
	PlayerBaseMeta conver2Meta();
}
