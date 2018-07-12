package evn.EvnSave.pojo;public class ZSetBean implements Comparable<ZSetBean>{	private String key;	private Long score;	public String getKey()	{		return key;	}	public void setKey(String key)	{		this.key = key;	}	public Long getScore()	{		return score;	}	public void setScore(Long score)	{		this.score = score;	}	public int compareTo(ZSetBean o)	{		return Long.valueOf(this.getScore() - o.getScore()).intValue();	}	@Override	public int hashCode()	{		final int prime = 31;		int result = 1;		result = prime * result + ((key == null) ? 0 : key.hashCode());		return result;	}	@Override	public boolean equals(Object obj)	{		if (this == obj)			return true;		if (obj == null)			return false;		if (getClass() != obj.getClass())			return false;		ZSetBean other = (ZSetBean) obj;		if (key == null)		{			if (other.key != null)				return false;		}		else if (!key.equals(other.key))			return false;		return true;	}	@Override	public String toString()	{		return "ZSetBean [key=" + key + ", score=" + score + "]";	}}