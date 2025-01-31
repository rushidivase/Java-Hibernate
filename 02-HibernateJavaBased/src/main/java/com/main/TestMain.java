package com.main;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.config.HibernateUtil;
import com.model.Employee;

public class TestMain {
	public static void main(String[] args) {

		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		Transaction txn = session.beginTransaction();

		Employee employee = session.get(Employee.class, 10001);
		employee.setEname("Isha");
		
		
		session.update(employee);
		txn.commit();

	}

}
