package com.example.example.d;

public class Student {
	int sId;
	String sName;
	String sCity;

	public Student() {
		System.out.println("Hello");

	}

	public Student(int sId, String sName, String sCity) {

		this.sId = sId;
		this.sName = sName;
		this.sCity = sCity;
	}
	public	Student(Student student)

	{ this.sId= student.sId;
	this.sName= student.sName;
	this.sCity= student.sCity;

	}

	void display()
	{
		System.out.println(sId);
		System.out.println(sName);
		System.out.println(sCity);
	}

	public static void main(String[] args) {
		Student s1=new Student(101,"mahi","Pune");
		//Student s3=s1;
		Student s2=new Student(s1);
		s2.display();
		//s3.display();
	}





}
