package com.main;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.config.HibernateUtil;
import com.model.User;

public class TestMain {

	public static void main(String[] args) {

		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		Scanner s = new Scanner(System.in);

		// getRecordBySQL(session);

		// getDataByHQL(session);

		deleteRecordById(session);

		// updateRecord(session, s);

	}

	private static void updateRecord(Session session, Scanner s) {
		Transaction txn = session.beginTransaction();

		String hql = "update User set uname=:uname, mono=:mono where uid=:uid";
		Query query = session.createQuery(hql);

		System.out.println("Enter Uid to Update Record:");
		query.setParameter("uid", s.nextInt());

		System.out.println("Enter New Name:");
		query.setParameter("uname", s.next());

		System.out.println("Enter New Mobile Number:");
		query.setParameter("mono", s.nextLong());

		query.executeUpdate();
		txn.commit();
		System.out.println("Record Updated..!");
	}

	private static void deleteRecordById(Session session) {
		Transaction txn = session.beginTransaction();
		String hql = "delete from User where uid=:uid";
		Query query = session.createQuery(hql);
		query.setParameter("uid", 101);
		query.executeUpdate();
		txn.commit();
		System.out.println("Record Deleted Successfully..!");
	}

	private static void getDataByHQL(Session session) {
		String hql = "from User";

		Query query = session.createQuery(hql);
		List<User> uList = query.getResultList();
		System.out.println(uList);
	}

	private static void getRecordBySQL(Session session) {
		String sql = "select * from user_data";

		Query query = session.createSQLQuery(sql).addEntity(User.class);

		List<User> uList = query.getResultList();
		System.out.println(uList);
	}
}
