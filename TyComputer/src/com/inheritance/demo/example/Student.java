package com.inheritance.demo.example;

public class Student extends Data {
float percentage;
String College;
String div;
String branch;

	void demo()
	{
		city="hyd";
		System.out.println("Student City Is "+city);
		
	}
	
	public static void main(String[] args) {
		Student s1=new Student();
		System.out.println(s1.city);
		s1.getData("ajay", "mumbai", "MH", "India", "12345678902");
		System.out.println(s1.toString());
	}
}
