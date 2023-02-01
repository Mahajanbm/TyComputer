package com.demo.collectiondemo;

import java.security.AlgorithmConstraints;
import java.util.ArrayList;
import java.util.Iterator;

public class Test2 {

	public static void main(String[] args) {
		ArrayList<String> arrayList=new ArrayList<>();

		arrayList.add("Pune");
		arrayList.add("Delhi");
		arrayList.add("nagpur");
		arrayList.add("mumbai");
		arrayList.add("thane");
		arrayList.add("jaipur");
		arrayList.add("noida");
		arrayList.add("hyd");
		//System.out.println(arrayList);
		Iterator<String> i1=arrayList.iterator();
		while(i1.hasNext())

		{
			System.out.println(i1.next());
		}
		System.out.println("For each loop");

		for (String str : arrayList) {
			System.out.println(str);
		}


	}

}
