package com.demo.collectiondemo;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.security.auth.login.FailedLoginException;
import javax.swing.plaf.synth.SynthOptionPaneUI;

public class ArrayDemo {

	public static void main(String[] args) {

		Collection c1=new ArrayList();
		List l1=new ArrayList();
		AbstractList al1=new ArrayList();
		ArrayList al=new ArrayList();


		al.add(212);
		al.add("pune");
		al.add(true);
		al.add(5451.5f);
		//System.out.println(al.size());
		al.add(5451.5f);
		//System.out.println(al.size());


		System.out.println(al);

		al1.add(555);
		al1.add(true);
		al1.add(false);
		al1.add(5451.5f);
		al1.add("mm");
		al1.add("MIT");
		al1.add(0,"pune");
		al1.remove("mm");
		System.out.println(al1);
		
		System.out.println(al1.size());

		
		l1.add(444);
		l1.add("mahajan");
		l1.add("Pune");
		l1.add("mumbai");
		System.out.println(l1);




	}

}
