package com.bajaj.service;

public class Employee {
	int eid;
	String ename;
	String referral;
	
	
	public Employee(int eid, String ename, String referral) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.referral = referral;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getReferral() {
		return referral;
	}
	public void setReferral(String referral) {
		this.referral = referral;
	}
}
