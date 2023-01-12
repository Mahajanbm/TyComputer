package org.mit.ty.computer;

import java.util.Scanner;

import javax.print.attribute.standard.NumberUpSupported;

public class Demo1 {

	public static void main(String[] args) {

		int a,b,c;
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter 1st Number");
		a=s1.nextInt();
		System.out.println("Enter 2nd Number");
		b=s1.nextInt();
		System.out.println("Enter 3rd Number");
		c=s1.nextInt();
		if(a>b && a>c)
		{
			System.out.println("A is greater");
		}
		else if (b>a && b>c)

		{
			System.out.println("  B is greater ");
		}
		else if (c>a && c>b) {
			System.out.println("  C is greater ");
		}
		
		
		else if ( a==b && a==c) {
			System.out.println("All are equal");
		}
		else 
		{
			System.out.println("2 numbers are equal");
		}
		
		
	}

}
