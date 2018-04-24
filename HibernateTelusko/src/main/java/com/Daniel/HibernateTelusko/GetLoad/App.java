package com.Daniel.HibernateTelusko.GetLoad;

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
		
		
			
		
//		for(int i = 1; i<=20; i++) {
//			Laptop laptop = new Laptop();
//			laptop.setLid(i);					
//			laptop.setLname("Dell");
//			laptop.setPrice(700);
//			session.save(laptop);	
//		}
		
			/*CASI NO SE USA LOAD PARA HACER FETCH DE LOS DATOS*/
		/*Proxy object --> "fake object"*/
		Laptop lap = (Laptop) session.load(Laptop.class, 6);			/*Load da un proxy object, quiere decir que da un "objeto vacio" y luego lo llena cuando se use*/
		
		/*EXCEPCIONES:
		 * Si por ejemplo se intenta obtener el elemento 200 y en la base no existe, y se quiere hacer un get, por ejemplo lap.getName()
		 * 		- Con Load tira una excepcion ObjectNotFoundException
		 * 		- Con get simplemente tira un NullPointerException 
		 * */
		
		try {										/*Ver que a pesar que se manda llamar el objeto con load, no escupe el query si no hasta que se hace un println*/
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(lap);
		
		session.getTransaction().commit();
				
	}
	

}
