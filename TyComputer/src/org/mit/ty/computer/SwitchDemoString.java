package org.mit.ty.computer;

import java.util.Scanner;

public class SwitchDemoString {

	public static void main(String[] args) {
		String Str;
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter String data");
		Str=s1.next();
		switch(Str) {
		case "Soham":
			System.out.println("I am Soham");
			break;
		case "Rohit":
			System.out.println("I am Rohit");
			break;
		case  "Virat":
			System.out.println("I am Virat");
			break;
		case "Surya":
			System.out.println("I am Surya");
			break;
			default :
				System.out.println("Please Enter Valid data");

		}

	}

}
