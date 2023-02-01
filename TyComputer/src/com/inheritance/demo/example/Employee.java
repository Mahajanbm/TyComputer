package com.inheritance.demo.example;

public class Employee  extends  Data{

	public static void main(String[] args) {
		Employee e1=new Employee();
		e1.getData("mahi", "hyd", "Ts", "India", "99999999");
		System.out.println(e1.toString());
	}
}
