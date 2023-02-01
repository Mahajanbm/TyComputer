package com.example.example.demo;



public class Student {
	private int sId;
	private  String sName;
	private String sCity;
	private String dept;
	public Student() {
		System.out.println("Deafult Constructor");
	}
	public Student(int sId) {
		System.out.println("One Parameter Constructor");
	}
	public Student(int sId, String sName) {
		System.out.println("two Parameter Constructor");
	}
	public Student(int sId, String sName, String sCity, String dept) {
		System.out.println("all Parameter Constructor");
	}

	public static void main(String[] args) {
		Student s1=new Student();
		Student s2=new Student(50);
	}
}
