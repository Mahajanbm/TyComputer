package com.demo.example;

public class Student1 {
	static int y=50;
	private  int rollno=1;
	private String name="Mahi";
	private String dept="cse";
	private String city="Pune";
	private float  percentage=54.25f;
	public Student1()
	{
		System.out.println("This Consturctor");
	}
	static
	{
		System.out.println("This is static block");
	}

	{
		System.out.println("This is non-static block");
	}
	public static void display()
	{
		System.out.println("This is static method");
	}
	public void setRollno(int rollno)
	{
		this.rollno=rollno;
	}
	public int getRollno()
	{
		return rollno;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}

	public void setDept(String dept)
	{
		this.dept=dept;
	}

	public String getDept()
	{
		return dept;
	}
	public void setCity(String city)
	{
		this.city=city;
	}

	public String getCity()
	{
		return city;
	}

	public void setPercentage(float percentage)
	{
		this.percentage=percentage;
	}

	public float getPercentage()
	{
		return percentage;
	}


















}
