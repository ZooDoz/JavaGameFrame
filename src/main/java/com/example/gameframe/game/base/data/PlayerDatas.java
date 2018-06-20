package com.example.gameframe.game.base.data;

import java.util.Map;

/**
 * 这是一个player数据的集合
 * 包含了玩家的所有个人数据
 * @author zoodoz
 * create date 2018/6/20
 */
public class PlayerDatas
{
    /**
     * 唯一标识
     */
    private String pid;
    /**
     * 元数据集合
     */
    private Map<String , PlayerBaseData> m;

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public Map<String, PlayerBaseData> getM() {
        return m;
    }

    public void setM(Map<String, PlayerBaseData> m) {
        this.m = m;
    }
}
