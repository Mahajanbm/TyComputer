package com.example.demo;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Employee {

	private int eId;
	private	String eName;
	private	String eCity;
	private	float eSalary;
	Scanner s1=new Scanner(System.in);
	void getData()
	{
		try {
			String str=null;
			//System.out.println(str.charAt(0));
			System.out.println("Enter Employee Id");
			eId=s1.nextInt();
			System.out.println("Enter Employee Name");
			eName=s1.next();
			System.out.println("Enter Employee City");
			eCity=s1.next();
			System.out.println("Enter Employee Esalary");
			eSalary=s1.nextFloat();
		}
		
		catch(InputMismatchException e)
		{
			System.out.println("Please Enter valid Data");
		}
	
		catch (NullPointerException  e) {
			System.out.println("please enter String Data only ");
		}
		catch (Exception e) {
			System.out.println("Error");
		}


	}


	void display()
	{
		System.out.println("Employee Id is:  "+eId);
		System.out.println("Employee name is:  "+eName);
		System.out.println("Employee City is:  "+eCity);
		System.out.println("Employee eSalary is:  "+eSalary);
	}
}