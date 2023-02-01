package com.example.exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileDemo {


	void demo() throws FileNotFoundException, ClassNotFoundException
	{
		File f1=new File("mahi.txt");
		FileInputStream f=new FileInputStream(f1);

		Class.forName("com.mysql.jdbc.Driver");

	}
	public static void main(String[] args)throws FileNotFoundException,ClassNotFoundException {
		FileDemo d1=new FileDemo();
		d1.demo();

	}

}
