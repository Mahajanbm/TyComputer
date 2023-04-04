package com.curd.service;

import java.util.Scanner;

import javax.persistence.EntityManager;
import com.curd.dbconnection.DbConnection;
import com.curd.entity.Product;
import com.curd.repository.Delete;

public class DeleteData implements Delete {
	DbConnection connection=new DbConnection();
	Product p1=new Product();
	Scanner s1=new Scanner(System.in);
	public void delete() {
		EntityManager em=connection.creatEntityManagerFactory().createEntityManager();
		em.getTransaction().begin();
		System.out.println("Enter Proudct To delete");
		int id=s1.nextInt();
		p1=em.getReference(Product.class, id);
		em.remove(p1);
		em.getTransaction().commit();
		em.close();

	}

}
