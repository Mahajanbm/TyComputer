package com.demo.demo.example;

public interface P1 {
	int a=10, b=80;
	static int z=50;
	final int x=50;
	static	void display()
	{
		System.out.println("this is static method");
	}

	default	void demo() {
		System.out.println("his is default modifier");
	}


}
