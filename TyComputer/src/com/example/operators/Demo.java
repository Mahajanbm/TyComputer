package com.example.operators;

import java.util.Scanner;

public class Demo {
	int a,b,c;
	Scanner s1=new Scanner(System.in);
	void getData()
	{
		System.out.println("Enter 1 st number");
		a=s1.nextInt();
		System.out.println("Enter 2nd Number");
		b=s1.nextInt();

	}
	void add()
	{
		c=a+b;
		System.out.println("Addition is "+c);

	}
	void sub()
	{
		c=a-b;
		System.out.println("Substraction is "+c);

	}
	void mul()
	{
		c=a*b;
		System.out.println("Multiplication is "+c);

	}
	void div()
	{
		c=a+b;
		System.out.println("Division is "+c);

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		Demo d1=new Demo();
		Demo d2=new Demo();
		System.out.println(d2 instanceof Demo);
		d1.getData();
		d1.add();
		d1.sub();
		d1.mul();
		d1.div();
	}

}
