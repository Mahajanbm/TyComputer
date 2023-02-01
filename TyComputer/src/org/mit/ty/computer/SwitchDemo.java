package org.mit.ty.computer;

import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {

		int a;
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter your Choice");
		a=s1.nextInt();
		switch(a)
		{

		case 1:
			System.out.println("User Enterd Number 1");
			break;
		case 2:
			System.out.println("USer Enterd number 2");
			break;
		case 3:
			System.out.println("User Enterd number 3");
			break;
		default: System.out.println("user input is wrong");


		}
	}

}
