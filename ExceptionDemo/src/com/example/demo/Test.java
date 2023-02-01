package com.example.demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test {

	public static void main(String[] args) throws FileNotFoundException  {
		
		File f1=new File("C:\\Users\\Mahi\\Desktop\\ComputerTY\\Demomm.java");
		FileInputStream f2=new FileInputStream(f1);
		System.out.println("File is Exist");
	}

}
