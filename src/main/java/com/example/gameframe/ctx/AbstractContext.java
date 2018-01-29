package com.example.gameframe.ctx;

public abstract class AbstractContext <Si extends Session , Rq extends Request , Rp extends Response> implements Context 
{
	private Si session;
	private Rq request;
	private Rp response;
	
	public AbstractContext(Si si, Rq rq , Rp rp)
	{
		this.request = rq;
		this.response = rp;
		this.session = si;
	}
	
	public Rq getRequest() {
		return request;
	}
	public Rp getResponse() {
		return response;
	}
	public void setRequest(Rq request) {
		this.request = request;
	}
	public void setResponse(Rp response) {
		this.response = response;
	}
	public Si getSession() {
		return session;
	}
	public void setSession(Si session) {
		this.session = session;
	}
}
