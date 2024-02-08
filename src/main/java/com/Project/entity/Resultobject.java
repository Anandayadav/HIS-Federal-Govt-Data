package com.Project.entity;

public class Resultobject {

	private String state;
	private String ssn;
	public Resultobject(String state, String ssn) {
		super();
		this.state = state;
		this.ssn = ssn;
	}
	public Resultobject() {
		super();
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	
	
}
