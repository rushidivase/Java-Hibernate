package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.config.HibernateUtil;
import com.model.Student;
import com.model.StudentId;

public class TestMain {
	public static void main(String[] args) {

		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		Transaction txn = session.beginTransaction();
		
		StudentId id1 = new StudentId(102, 111);
		StudentId id2 = new StudentId(102, 222);
		
		Student s1 = new Student();
		s1.setName("Raj");
		s1.setMono(87654345678l);
		s1.setStudentId(id1);
		
		Student s2 = new Student();
		s2.setName("Isha");
		s2.setMono(99654345678l);
		s2.setStudentId(id2);
		
		session.save(s1);
		session.save(s2);
		txn.commit();
	}
}
