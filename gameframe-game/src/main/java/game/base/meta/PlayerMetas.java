package game.base.meta;

import evn.pojo.Evn;

import java.util.Map;

/**
 * 这是一个player的源数据集合
 * @author zoodoz
 *
 */
public class PlayerMetas 
{
	/**
	 * 唯一标识
	 */
	private String pid;
	/**
	 * 玩家的环境
	 */
	private Evn e;
	/**
	 * 元数据集合
	 */
	private Map<String , PlayerBaseMeta> m;

	public Map<String, PlayerBaseMeta> getM() {
		return m;
	}

	public void setM(Map<String, PlayerBaseMeta> m) {
		this.m = m;
	}

	public String getPid() {
		return pid;
	}

	public void setPid(String pid) {
		this.pid = pid;
	}
	
}
