package com.demo.collectiondemo;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//	int[] a= {10,50,60,80,90};
		//	System.out.println(a[0]);
		int[] a=new int[5];
		int [] b=new int[10];
		int [] c=new int[11];
		Object [] objects=new Object[5];
		objects[0]="mahi";
		objects[1]=1234;
		objects[2]=true;
		objects[3]=null;
		System.out.println(objects[1]);
		//a=b;
		a[0]=2;
		a[1]=60;
		a[2]=70;
		a[3]=80;
		a[4]=90;
		//a[5]=60;
		System.out.println(a[0]);
		//System.out.println(a[4]);


	}

}
