package com.employeemanagementsytem.service;

public class Employee {
	private int eId;
	private String eName;
	private String eCity;
	private String eDpet;
	private float eSalary;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int geteId() {
		return eId;
	}
	public void seteId(int eId) {
		this.eId = eId;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public String geteCity() {
		return eCity;
	}
	public void seteCity(String eCity) {
		this.eCity = eCity;
	}
	public String geteDpet() {
		return eDpet;
	}
	public void seteDpet(String eDpet) {
		this.eDpet = eDpet;
	}
	public float geteSalary() {
		return eSalary;
	}
	public void seteSalary(float eSalary) {
		this.eSalary = eSalary;
	}
	

}
