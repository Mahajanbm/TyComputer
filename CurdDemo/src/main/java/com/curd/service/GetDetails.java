package com.curd.service;

import java.util.Scanner;

import javax.persistence.EntityManager;

import com.curd.dbconnection.DbConnection;
import com.curd.entity.Product;
import com.curd.repository.Fetch;

public class GetDetails implements Fetch {
	DbConnection connection=new DbConnection();
	Product p1=new Product();
	Scanner s1=new Scanner(System.in);
	public void fetech() {

		EntityManager eManager=connection.creatEntityManagerFactory().createEntityManager();
		eManager.getTransaction().begin();
		System.out.println("Enter Proudct id");
		int id=s1.nextInt();
		p1=eManager.getReference(Product.class, id);
		System.out.println(p1.getName());
		System.out.println(p1.getDescription());
		System.out.println(p1.getPrice());
		eManager.getTransaction().commit();
		eManager.close();


	}

}
