package com.demo.collectiondemo;

import java.security.AlgorithmConstraints;
import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee> al=new ArrayList<>();
		Employee e1=new Employee();
		Employee e2=new Employee();
		Employee e3=new Employee(103, "Chinmay", "nagpur", "CSE", 454545);
		e1.seteId(101);
		e1.seteName("mahi");
		e1.seteSalaty(124545);
		e1.seteCity("pune");
		e1.seteDept("HR");
		e2.seteId(102);
		e2.seteName("Sahil");
		e2.seteSalaty(124545);
		e2.seteCity("Amaravati");
		e2.seteDept("CSE");
		al.add(e1);
		al.add(e2);
		al.add(e3);
		
		System.out.println(al);
		
		

	}

}
