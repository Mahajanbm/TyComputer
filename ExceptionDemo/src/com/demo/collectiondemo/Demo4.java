package com.demo.collectiondemo;

import java.util.Stack;

public class Demo4 {

	public static void main(String[] args) {
		Stack<Student> stack=new Stack<>();
		Student s1=new Student();
		Student s2=new Student();
		s1.setsId(101);
		s1.setsName("nani");
		s1.setsCity("pune");
		s1.setDept("CSE");
		s2.setsId(102);
		s2.setsName("ajay");
		s2.setsCity("Delhi");
		s2.setDept("etc");
		stack.push(s1);
		stack.push(s2);
		System.out.println(stack);
		stack.pop();
		System.out.println(stack);
	}

}
