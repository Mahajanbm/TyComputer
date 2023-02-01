package com.example.example.demo;

public class Child extends Parent {
	void demo(int a)
	{ 
		System.out.println("this is Demo method  of child class");
	}
	public static void main(String[] args) {
		Child c1=new Child();
		
		c1.demo(10);
		Parent p1=new Parent();
		p1.demo(10);
	}
}
