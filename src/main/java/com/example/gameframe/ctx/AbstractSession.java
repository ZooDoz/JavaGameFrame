package com.example.gameframe.ctx;

public abstract class AbstractSession implements Session
{
	private String id;
	/**
	 * 原始的si
	 */
	private AbstractSession si;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		AbstractSession other = (AbstractSession) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	public AbstractSession getSi() {
		return si;
	}

	public void setSi(AbstractSession si) {
		this.si = si;
	}
}
