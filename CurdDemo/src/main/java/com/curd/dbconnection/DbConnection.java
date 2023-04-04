package com.curd.dbconnection;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DbConnection {

	public EntityManagerFactory creatEntityManagerFactory()
	{
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("mm");
	
		return entityManagerFactory;



	}

}
