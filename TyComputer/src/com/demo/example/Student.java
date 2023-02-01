package com.demo.example;

public class Student {
private  int rollno=1;
 private String name="Mahi";
 private String dept="cse";
 private String city="Pune";
 private float  percentage=54.25f;
 
 public void getData(int rollno,String name,String dept,String city,float percentage)
 {
	this.rollno=rollno;
	this.name=name;
	this.dept=dept;
	this.city=city;
	this.percentage=percentage;
 }
 public void display()
 {
	 System.out.println(rollno);
	 System.out.println(name);
	 System.out.println(dept);
	 System.out.println(city);
	 System.out.println(percentage);
 }
 
 
	
}
