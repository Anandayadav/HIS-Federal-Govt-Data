package com.Project.entity;

import java.time.LocalDate;

public class Citizen {

	private  String name;
	private LocalDate dob;
	private String ssn;
	public Citizen(String name, LocalDate dob, String ssn) {
		super();
		this.name = name;
		this.dob = dob;
		this.ssn = ssn;
	}
	public Citizen() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	
	
}
