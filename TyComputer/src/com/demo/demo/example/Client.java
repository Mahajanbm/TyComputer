package com.demo.demo.example;

public class Client implements I2 {
	public static void main(String[] args) {
		I1 i1=new Client();
		i1.demo();
		I2 i2=new Client();
		i2.demo1();
	}
	public void demo() {
		System.out.println("Demo method");
		
	}
	public void demo1() {
		System.out.println("Demo1 method");
		
	}

}
