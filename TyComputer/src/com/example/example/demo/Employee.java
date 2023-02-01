package com.example.example.demo;

public class Employee {
	private int eId;
	private String eName;
	private String eCity;
	private float eSalary;
	void getData()
	{
		System.out.println("Getdata method called With no parameter");

	}
	void getData(int eId)

	{

		System.out.println("GetData Method wiht Eid As Parameter");
	}
	void getData(int eId,String eName)
	{
		System.out.println("GetData Method wiht Eid and ename As Parameter");
	}
	void getData(int eId, String eName, String eCity, float eSalary) {

		System.out.println("Employee with all Data");
	}
	public static void main(String[] args) {
		Employee e1=new Employee();
		e1.getData(101);

	}
}
