package main.java.com.example.gameframe.ctx;

/**
 * 请求的session
 */
public abstract class AbstractRequest implements Request
{
	/**
	 * 传递来自上层的唯一标识
	 */
	protected String sid;
	/**
	 * 原始的请求对象

	 */
	protected Object orq;

	public String getSid() {
		return sid;
	}

	public void setSid(String sid) {
		this.sid = sid;
	}
	public Object getOrq() {
		return orq;
	}

	public void setOrq(Object orq) {
		this.orq = orq;
	}
}
