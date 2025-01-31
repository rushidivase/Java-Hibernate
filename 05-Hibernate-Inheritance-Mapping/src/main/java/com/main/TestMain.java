package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.config.HibernateUtil;
import com.model.DyChinchwad;
import com.model.DyPatil;
import com.model.DyPune;

public class TestMain {
	public static void main(String[] args) {

		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		Transaction txn = session.beginTransaction();
		
		DyPune pune = new DyPune();
		pune.setSid(101);
		pune.setSname("Akash");
		pune.setMono(87654345678l);
		pune.setHostelFacility(true);
		
		DyChinchwad ch= new DyChinchwad();
		ch.setSid(102);
		ch.setSname("ISha");
		ch.setMono(87654456789l);
		ch.setBusFacility(false);
		
		DyPatil dy = new DyPatil();
		dy.setSid(87678);
		dy.setSname("Raj");
		dy.setMono(87654456789l);
		
		session.save(pune);
		session.save(ch);
		session.save(dy);
		txn.commit();
		
	}
}
