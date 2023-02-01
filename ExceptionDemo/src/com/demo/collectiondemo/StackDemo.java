package com.demo.collectiondemo;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		Stack s1=new Stack<>();
		System.out.println(s1.isEmpty());
		s1.push(10);
		s1.push("mahi");
		s1.push(45);
		s1.push("pune");
		s1.push(88);
		s1.push(545);
		System.out.println(s1);
		s1.pop();
		System.out.println(s1);
		
		System.out.println(s1.peek());
		


	}

}
