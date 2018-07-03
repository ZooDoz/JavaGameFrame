package net.pojo;

/**
 * 注册实例
 * 作为一个user在net层的唯一标识
 * @author zoodoz
 *
 */
public class NetRegistrant <E extends NetRegistEvn>
{
	/**
	 * 唯一标识
	 */
	private String t;

	/**
	 * 注册者的evn
	 */
	private E evn;

	public String getT() {
		return t;
	}

	public void setT(String t) {
		this.t = t;
	}

	public E getEvn() {
		return evn;
	}

	public void setEvn(E evn) {
		this.evn = evn;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((t == null) ? 0 : t.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		NetRegistrant other = (NetRegistrant) obj;
		if (t == null) {
			if (other.t != null)
				return false;
		} else if (!t.equals(other.t))
			return false;
		return true;
	}
}
