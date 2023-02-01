package com.example.exception;

public class Client {

	public static void main(String[] args)  {
		//UserDefine u1=new UserDefine();

		try {
			throw new UserDefine("hi");
		} catch (UserDefine e) {
			System.out.println("Hello mahi");

		}


	}

}
