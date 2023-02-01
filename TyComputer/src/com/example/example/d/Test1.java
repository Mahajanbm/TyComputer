package com.example.example.d;

public class Test1 extends Employee1 {

	 void getData()
	{
		System.out.println("GetData Method");
	}
	public static void main(String[] args) {
	Employee1 employee1=new Test1() ;
	
	employee1.getData();
	}

}
