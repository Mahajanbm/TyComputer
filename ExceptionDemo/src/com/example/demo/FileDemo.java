package com.example.demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;import java.nio.channels.InterruptedByTimeoutException;
import java.util.Scanner;

public class FileDemo {

	public static void main(String[] args) throws IOException {
		File f1=new File("C:\\Users\\Mahi\\Desktop\\Super30\\Employee.java");
		FileInputStream f = null;
		try {
			f=new FileInputStream(f1);
			System.out.println("File is present");
			byte[] b=	f.readAllBytes();
			
			for(int i=0;i<=b.length;i++ )
			{
				System.out.print((char)b[i]);
			}
			

			int a;
			Scanner s1=new Scanner(System.in);
			System.out.println("Enter number");
			a=s1.nextInt();
			System.out.println("Hello");
		} catch (FileNotFoundException e) {
			System.out.println("File is not present");
		}
		finally {
			f.close();
			System.out.println("File Close Sucessfully");
		}


	}

}
