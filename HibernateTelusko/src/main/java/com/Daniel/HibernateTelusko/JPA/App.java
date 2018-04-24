package com.Daniel.HibernateTelusko.JPA;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import com.Daniel.HibernateTelusko.Cache.SecondLevelCache.Alien;

public class App {
	public static void main(String args[]) {
		

		
		Alien alien = new Alien();
		
		
		
		/*El codigo no es funcional pero solo es para demostrar como hacerlo con JPA*/
		/*JPA trabaja con entities, por eso el EntityManager*/
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");		/*pu es el persistence-unit 
		del archivo persistence.xml que se encuentra en src-main-resources-META-INF-persistence.xml
		(No esta dentro del proyecto, ver como se crea el quickstart con maven de:
		https://www.youtube.com/watch?v=otinfgwkMbY&index=26&list=PLsyeobzWxl7qBZtsEvp_n2A7sJs2MpF3r
		*/
		EntityManager em = emf.createEntityManager();
		
		
		
		
		/*PARA GUARDAR INFO*/
		/*Primero se debe de empezar una transacción para que pueda guardar la informacion y hacer commit */
		em.getTransaction().begin();
		em.persist(alien);
		em.getTransaction().commit();
		
		/*PARA OBTENER INFO*/
		Alien a = em.find(Alien.class, 4);
		
	}
	

}
