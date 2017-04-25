 package com.hareesh.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateSessionFactory {

	
	
	public SessionFactory getSessionFactory(){
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		
		return sessionFactory;
	}
	
	
}
