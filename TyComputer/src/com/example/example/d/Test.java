package com.example.example.d;

public class Test  extends Employee{

	public  Test()
	{super(10);
		System.out.println("Hello Test child");

	}

	public Test(int x)
	{ 
		this();
		System.out.println("test class parameterized constructor");
	}
	public static void main(String[] args) {

		Test t1=new Test(10);
	}

}
