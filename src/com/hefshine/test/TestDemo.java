package com.hefshine.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hefshine.beans.Person;

public class TestDemo {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure().buildSessionFactory();

		Session session = factory.openSession();

		session.beginTransaction();

		Person person = new Person(102, "Asin", "Sharma", "Mumbai");

		session.save(person);

		session.getTransaction().commit();

		session.close();		

	}
}