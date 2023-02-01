package com.example.example.d;

public class Employee {
	public     Employee()
	{
		System.out.println("Hello Employee parent");
	}
	public Employee(int a)
	{
		this();
		System.out.println("parameterized constructor");
	}


}
