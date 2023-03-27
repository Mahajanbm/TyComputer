package net.project.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import net.project.entity.Student;

public class Test {
	public static void main(String[] args) {
		EntityManagerFactory eManagerFactory=Persistence.createEntityManagerFactory("nn");
		EntityManager eManager=eManagerFactory.createEntityManager();

		eManager.getTransaction().begin();
		Student s1=new Student();
		s1.setId(22);
		s1.setName("Mahi");
		s1.setCity("Pune");
		s1.setMobile("9955662233");
		s1.setMobile("C");
		eManager.persist(s1);
		eManager.getTransaction().commit();
		eManagerFactory.close();
		eManager.close();
	}
}
