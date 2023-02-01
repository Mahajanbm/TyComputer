package com.demo.collectiondemo;

public class Employee {
	private int eId;
	private String eName;
	private String eCity;
	private String eDept;
	private float eSalaty;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int eId, String eName, String eCity, String eDept, float eSalaty) {
		super();
		this.eId = eId;
		this.eName = eName;
		this.eCity = eCity;
		this.eDept = eDept;
		this.eSalaty = eSalaty;
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
	public String geteDept() {
		return eDept;
	}
	public void seteDept(String eDept) {
		this.eDept = eDept;
	}
	public float geteSalaty() {
		return eSalaty;
	}
	public void seteSalaty(float eSalaty) {
		this.eSalaty = eSalaty;
	}
	@Override
	public String toString() {
		return "Employee [eId=" + eId + ", eName=" + eName + ", eCity=" + eCity + ", eDept=" + eDept + ", eSalaty="
				+ eSalaty + "]";
	}
	

}
