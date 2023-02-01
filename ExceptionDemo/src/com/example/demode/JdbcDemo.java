package com.example.demode;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo {

	public static void main(String[] args) throws SQLException {
		Connection c = null;
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			c=DriverManager.getConnection("jdbc:mysql://localhost:3306/tycomp","root","4321");
			System.out.println("sucessfully connected with mysql");
			Statement s=c.createStatement();
			s.execute("insert into emp values('mm','Ajay','pune')");
			System.out.println("Data Inserted Sucess fully");

		}
		catch (Exception e) {
			System.out.println("Error");
		}
		finally {
			c.close();
			System.out.println("Connection close");
		}
	}

}
