package com.demo.collectiondemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] aStrings= {"Ajay","Nani","Mahi"};
		List<String> l1=Arrays.asList(aStrings);
		List  l3=new ArrayList<>();

		//System.out.println(l1);
		List<String> l2=new ArrayList<>();
		l2.add("Pune");
		l2.add("Pune");
		l2.add(0, "Hyd");
		l2.add("mumbai");
		l2.add("delhi");
		l2.add("nagpur");
		System.out.println(l2);
		System.out.println(l2.size());

		System.out.println(l2.contains("pune"));
		l2.remove(0);
		l2.remove("delhi");
		System.out.println(l2);


		l3.add(1234);
		l3.add(545);
		l3.add(5478);
		l3.add(888);
		l3.add(5454);
		l3.set(0, 444);

		for(int i=0;i<l3.size();i++)
		{
			System.out.println(l3.get(i));
		}






















	}

}
