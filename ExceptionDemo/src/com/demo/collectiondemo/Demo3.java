package com.demo.collectiondemo;

import java.util.ArrayList;
import java.util.ListIterator;

public class Demo3 {

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

		/*	for(int i=arrayList.size()-1;i>=0;i--)
	{
		System.out.println(arrayList.get(i));
	}*/
		ListIterator<String> l1=arrayList.listIterator();

		while(l1.hasNext())
		{
			System.out.println(l1.next());
		}
		System.out.println("reverse Of data");
		while(l1.hasPrevious())
		{
			System.out.println(l1.previous());
		}

	}

}
