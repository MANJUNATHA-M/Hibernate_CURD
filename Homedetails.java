package com.hibernate.curd.HIBERNATE_CURD;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Homedetails {
	@Id
	private int hId;
	private int hSal;
	private String hName;
	private String Hjob;
	public int gethId() {
		return hId;
	}
	public void sethId(int hId) {
		this.hId = hId;
	}
	public int gethSal() {
		return hSal;
	}
	public void sethSal(int hSal) {
		this.hSal = hSal;
	}
	public String gethName() {
		return hName;
	}
	public void sethName(String hName) {
		this.hName = hName;
	}
	public String getHjob() {
		return Hjob;
	}
	public void setHjob(String hjob) {
		Hjob = hjob;
	}
	@Override
	public String toString() {
		return "Homedetails [hId=" + hId + ", hSal=" + hSal + ", hName=" + hName + ", Hjob=" + Hjob + "]";
	}
	
	

}
