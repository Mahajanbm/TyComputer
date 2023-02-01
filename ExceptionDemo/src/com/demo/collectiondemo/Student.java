package com.demo.collectiondemo;

public class Student {
	private int sId;
	private String sName;
	private String sCity;
	private String dept;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int sId, String sName, String sCity, String dept) {
		super();
		this.sId = sId;
		this.sName = sName;
		this.sCity = sCity;
		this.dept = dept;
	}
	public int getsId() {
		return sId;
	}
	public void setsId(int sId) {
		this.sId = sId;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public String getsCity() {
		return sCity;
	}
	public void setsCity(String sCity) {
		this.sCity = sCity;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "Student [sId=" + sId + ", sName=" + sName + ", sCity=" + sCity + ", dept=" + dept + "]";
	}
	

}
