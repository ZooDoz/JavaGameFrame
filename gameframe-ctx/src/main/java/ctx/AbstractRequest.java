package ctx;

/**
 * 请求的session
 */
public abstract class AbstractRequest <Rq extends  AbstractRequest>implements Request
{
	/**
	 * 传递来自上层的唯一标识
	 */
	protected String sid;
	/**
	 * 原始的请求对象

	 */
	protected Rq orq;

	public String getSid() {
		return sid;
	}

	public void setSid(String sid) {
		this.sid = sid;
	}

	public Rq getOrq() {
		return orq;
	}

	public void setOrq(Rq orq) {
		this.orq = orq;
	}
}
