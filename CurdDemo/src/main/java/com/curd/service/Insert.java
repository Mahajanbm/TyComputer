package com.curd.service;

import java.sql.Connection;
import java.util.Scanner;

import javax.persistence.EntityManager;

import com.curd.dbconnection.DbConnection;
import com.curd.entity.Product;
import com.curd.repository.Add;

public class Insert implements Add {
	DbConnection con=new DbConnection();
	Product p1=new Product();
	Scanner s1=new Scanner(System.in);
	public void add() {
		//con.creatEntityManagerFactory();
		EntityManager eManager=con.creatEntityManagerFactory().createEntityManager();
		eManager.getTransaction().begin();
		System.out.println("Enter Product Id");
		int id=s1.nextInt();
		System.out.println("Enter Product Name");
		String name=s1.next();
		System.out.println("Enter Product Description");
		String des=s1.next();
		System.out.println("Enter Product price");
		float price=s1.nextFloat();
		p1.setId(id);
		p1.setName(name);
		p1.setDescription(des);
		p1.setPrice(price);
		eManager.persist(p1);
		eManager.getTransaction().commit();
		System.out.println("Hello");
		con.creatEntityManagerFactory().close();
		eManager.close();

	}

}
