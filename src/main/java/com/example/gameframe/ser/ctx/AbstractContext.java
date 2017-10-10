package com.example.gameframe.ser.ctx;

public class AbstractContext <Rq extends Request , Rp extends Response> implements Context 
{
	private Rq request;
	private Rp response;
	
	public AbstractContext(Rq rq , Rp rp)
	{
		this.request = rq;
		this.response = rp;
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
}
