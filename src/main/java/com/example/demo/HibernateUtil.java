package com.example.demo;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	
	private static final SessionFactory SESSION_FACTORY = new Configuration().configure().buildSessionFactory();
	
	public static SessionFactory sessionFactory() {
		return SESSION_FACTORY;
	}

}
