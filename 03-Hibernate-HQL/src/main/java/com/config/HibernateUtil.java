package com.config;


import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import com.model.User; 

public class HibernateUtil
{
	public static SessionFactory factory;

	public static SessionFactory getSessionFactory()
	{
		if(factory==null)
		{
			Configuration cfg = new Configuration();
			
			Properties properties = new Properties();
			
			/* Database Properties */
			properties.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
			properties.put(Environment.URL, "jdbc:mysql://localhost:3306/teknowell");
			properties.put(Environment.USER,"root");
			properties.put(Environment.PASS,"root");
			
			/* Hibernate Properties */
			properties.put(Environment.DIALECT, "org.hibernate.dialect.MySQL57Dialect");
			properties.put(Environment.HBM2DDL_AUTO,"update");
			properties.put(Environment.SHOW_SQL, true);
			
			cfg.setProperties(properties);
			cfg.addAnnotatedClass(User.class);
			
			ServiceRegistry registry =  new StandardServiceRegistryBuilder().applySettings(cfg.getProperties()).build();
			factory =  cfg.buildSessionFactory(registry);
		}
		return factory;
	}
}
