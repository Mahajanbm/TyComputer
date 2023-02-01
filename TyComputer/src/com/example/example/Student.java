package com.example.example;

public class Student {
	public Student() {
		// TODO Auto-generated constructor stub
		System.out.println("this is constructor");
	}
	static
	{
		System.out.println("This is static  block");
	}
	{
		System.out.println("this is non-static block");
	}
	public static void main(String[] args) {
		Student s1=new Student();
		Student s2=new Student();
	}
}
