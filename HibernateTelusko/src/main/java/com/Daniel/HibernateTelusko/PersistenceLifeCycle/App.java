package com.Daniel.HibernateTelusko.PersistenceLifeCycle;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class App {
	public static void main(String args[]) {
		
		
		
	
		
		Configuration config = new Configuration().configure().addAnnotatedClass(Laptop.class);
	
		SessionFactory sf = config.buildSessionFactory();
		Session session = sf.openSession();
		
		session.beginTransaction();
		
		
		Laptop laptop = new Laptop();		/*En este momento es transient*/
		laptop.setLid(104);					
		laptop.setLname("Dell");
		laptop.setPrice(700);
		
		session.save(laptop);		/*Persistent state*/
		laptop.setPrice(600);
		
		session.getTransaction().commit();
		laptop.setPrice(500);				/*En este punto como ya se hizo commit, el objeto ya esta detached*/
//		session.getTransaction().commit();	//Aqui ya marcaría error hacer un commit
	}
	

}
