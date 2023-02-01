package com.example.exception;

public class UserDefine  extends Exception{

	public UserDefine(String hello) {
		super("hello");
		System.out.println("User define class");
	}

}
