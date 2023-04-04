package com.curd.test;

import java.util.Scanner;

import com.curd.repository.Add;
import com.curd.repository.Delete;
import com.curd.repository.Fetch;
import com.curd.repository.Update;
import com.curd.service.*;

public class Test {

	public static void main(String[] args) {
		System.out.println("Product Management System");
		Scanner s1=new Scanner(System.in);
		System.out.println("1.Insert Data");
		System.out.println("2.Update Data");
		System.out.println("3.Delete Data");
		System.out.println("4.Display Data");
		System.out.println("Enter Your Choice");
		int num=s1.nextInt();
		switch (num) {
		case 1:
			Add a1=new Insert();
			a1.add();
			System.out.println("Data Inserted Sucess Fully");

			break;
		case 2: 
			Update u1=new UpdateData();
			u1.update();
			System.out.println("Data Updated");
			break;
		case 3: 
			Delete d1=new DeleteData();
			d1.delete();
			System.out.println("Data deleted");
			break;
		case 4: 
			Fetch f1=new GetDetails();
			System.out.println(" Product Details");
			f1.fetech();

			break;
		default:
			break;
		}

	}

}
