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
	private String id;

	/**
	 * 注册者的evn
	 */
	private E evn;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public E getEvn() {
		return evn;
	}

	public void setEvn(E evn) {
		this.evn = evn;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof NetRegistrant)) return false;

		NetRegistrant<?> that = (NetRegistrant<?>) o;

		if (id != null ? !id.equals(that.id) : that.id != null) return false;
		return evn != null ? evn.equals(that.evn) : that.evn == null;
	}

	@Override
	public int hashCode() {
		int result = id != null ? id.hashCode() : 0;
		result = 31 * result + (evn != null ? evn.hashCode() : 0);
		return result;
	}
}
