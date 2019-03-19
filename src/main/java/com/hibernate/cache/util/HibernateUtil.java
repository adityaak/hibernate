package com.hibernate.cache.util;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

	private static final SessionFactory sFactory;
	
	static {
		try {
		sFactory = new Configuration().configure().buildSessionFactory();
	} catch (Throwable ex) {
		System.err.println("Initial SessionFactory creation failed." + ex);
        throw new ExceptionInInitializerError(ex);
	}
	}
	
	public static SessionFactory getSessionfactory() {
		return sFactory;
	}
}
