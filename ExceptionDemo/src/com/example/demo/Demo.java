package com.example.demo;

public class Demo {

	public static void main(String[] args) {
		int a[]= {  10,20,30,40};
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		try {
			System.out.println(a[5]);
		}catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println(" Array   Index  OutOf Bounds Exception ");
		}
		
				
		
	}

}
