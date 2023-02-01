package com.example.exception;

public class Employee {

	void demo() {
		int[] a= {10,20,50,80};

		try {
			System.out.println("Outer try Block");
			System.out.println(a[0]);
			//throw new ArrayIndexOutOfBoundsException();


		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("Error");
		}



	}

}
