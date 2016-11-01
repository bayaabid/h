package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.entity.Student;

public class AppTest {
	public static void main(String[] args) {
		
	
	Student student = new Student();
	student.setIdSudent(1L);
	student.setNameSudent("Kais");
	student.setEmailStudent("chaabane_kais2yahoo.ca");

	SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml")

			.buildSessionFactory();
	Session session = sessionFactory.getCurrentSession();
    session = sessionFactory.openSession();
    try
	{

		session.beginTransaction();
		session.save(student);
		session.getTransaction().commit();
	}finally
	{
		sessionFactory.close();

	}

}
	}
