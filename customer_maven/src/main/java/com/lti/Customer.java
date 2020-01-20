package com.lti;

public class Customer {

	private int cid;
	private String cname;
	private int cbalance;
	
	
	public Customer(){
		super();
	}
	
	
	
	public Customer(int cid, String cname, int cbalance) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.cbalance = cbalance;
	}



	public int getCid() {
		return cid;
	}



	public void setCid(int cid) {
		this.cid = cid;
	}



	public String getCname() {
		return cname;
	}



	public void setCname(String cname) {
		this.cname = cname;
	}



	public int getCbalance() {
		return cbalance;
	}



	public void setCbalance(int cbalance) {
		this.cbalance = cbalance;
	}



	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", cname=" + cname + ", cbalance=" + cbalance + "]";
	}
	
	
	
}
