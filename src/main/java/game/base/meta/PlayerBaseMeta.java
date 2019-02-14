package game.base.meta;

import game.base.pojo.SaveBean;

/**
 * player的base数据
 * @author zoodoz
 *
 */
public abstract class PlayerBaseMeta extends SaveBean
{

    /**
     * bean to data time
     */
    private Long btdTime;

    public Long getBtdTime() {
        return btdTime;
    }

    public void setBtdTime(Long btdTime) {
        this.btdTime = btdTime;
    }
}
