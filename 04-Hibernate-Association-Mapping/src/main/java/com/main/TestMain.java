package com.main;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.config.HibernateUtil;
import com.model.Customer;
import com.model.Product;

public class TestMain {
	public static void main(String[] args) {
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		Transaction txn = session.beginTransaction();

        Product p1 = new Product(101, "TV", "Black");
        Product p2 = new Product(102, "Laptoo", "Black");
        Product p3 = new Product(103, "Ring", "Black");
        Product p4 = new Product(104, "Chair", "Black");
        Product p5 = new Product(105, "Monitor", "Black");
        
        Set<Product> pset1= new HashSet<Product>();
        pset1.add(p1);
        pset1.add(p2);
        pset1.add(p3);
        pset1.add(p4);
        pset1.add(p5);
        
        Set<Product> pset2= new HashSet<Product>();
        pset2.add(p5);
        pset2.add(p2);
        pset2.add(p3);
        pset2.add(p4);
        pset1.add(p1);
        
        Customer c1 = new Customer(1, "Akash", "87654345678", pset1);

        Customer c2 = new Customer(2, "Raj", "87654345678", pset2);
        
        Set<Customer> cset= new HashSet<Customer>();
        cset.add(c1);
        cset.add(c2);
        
        p1.setcSet(cset);
        p2.setcSet(cset);
        p3.setcSet(cset);
        p4.setcSet(cset);
        p5.setcSet(cset);
        
        session.save(c1);
        session.save(c2);
        txn.commit();
        System.out.println("Records Saved..!");
        
        
	}
}
