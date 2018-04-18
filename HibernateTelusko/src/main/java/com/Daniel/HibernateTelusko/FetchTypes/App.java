package com.Daniel.HibernateTelusko.FetchTypes;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

/*Video 9 -- pendiente de ver*/
/**
 * Para crear el proyecto se hizo un new, maven project, internal -> quickstart 1.1
 *	Se agregan las dependencias de mysql connector y de hibernate para jalar el objeto Session quien tiene el metodo save
 *	Eclipse debe de tener el plugin de Hibernate para establecer configuraciones -- Para eso se busca JBoss tools y al dar siguiente
 *				solo se selecciona la opcion de hibernate
 */
public class App 
{
	static Configuration config;
	static ServiceRegistry registry;
	static SessionFactory sf;
	static Session session;
    public static void main( String[] args )
    {
    	
    	config = new Configuration().configure().addAnnotatedClass(Alien.class).addAnnotatedClass(Laptop.class);;
    	registry = new ServiceRegistryBuilder().applySettings(config.getProperties()).buildServiceRegistry();
    	sf = config.buildSessionFactory(registry);
    	session = sf.openSession();
		
		precargaDatos();
		
		
		/**********************************************/
		Alien alien = (Alien)session.get(Alien.class, 1);		/*Si Alien esta marcado como lazy, no traera las laptops en el objeto alien
		 														sin embargo, en caso de que se llegue a hacer un alien.getLaptops, si lo trae*/
		
		/*Si de antes se usa el metodo precargaDatos carga en la sesion el objeto, por lo que ya ni si quiera hace un select,
		 * Sin embargo si se cargan, se cambia el archivo de configuracion de hibernate de create a update, se 
		 * comenta el metodo de precargaDatos, arroja el siguiente select:
		 * Hibernate: select alien0_.aid as aid0_0_, alien0_.aName as aName0_0_ from alienFetch alien0_ where alien0_.aid=?*/
		
		/*Si se pone el system.out, donde se piden por las laptops del objeto arroja dos selects:
		 * - uno donde obtiene el objeto de Alien
		 * - el otro donde se recuperan las laptos del objeto de alien
		 * 		Hibernate: select alien0_.aid as aid0_0_, alien0_.aName as aName0_0_ from alienFetch alien0_ where alien0_.aid=?
		 *		Hibernate: select laps0_.alien_aid as alien4_0_1_, laps0_.lid as lid1_, laps0_.lid as lid1_0_, laps0_.alien_aid as alien4_1_0_, laps0_.brand as brand1_0_, laps0_.price as price1_0_ from laptopFetch laps0_ where laps0_.alien_aid=?
		 * 	
		 * System.out.println(alien.getLaps());
		 * 	*/
		
		/*
		 * Con el fetch=FetchType.EAGER ya trae todas las propiedades del objeto y arroja el siguiente query
		 * Hibernate: select alien0_.aid as aid0_1_, alien0_.aName as aName0_1_, laps1_.alien_aid as alien4_0_3_, laps1_.lid as lid3_, laps1_.lid as lid1_0_, laps1_.alien_aid as alien4_1_0_, laps1_.brand as brand1_0_, laps1_.price as price1_0_ from alienFetch alien0_ left outer join laptopFetch laps1_ on alien0_.aid=laps1_.alien_aid where alien0_.aid=?
		 * */
    }
    
    private static void precargaDatos(){
//    	Alien alien1 = new Alien();
//    	alien1.setAid(1);
//    	alien1.setaName("alien1");
//    	
//    	
//    	Laptop laptop1 = new Laptop();
//    	laptop1.setLid(1);
//    	laptop1.setBrand("laptop1");
//    	
//    	alien1.getLaps().add(laptop1);
//    	
//    	laptop1.setAlien(alien1);
//    	session.beginTransaction();
//    	session.save(alien1);
//    	session.save(laptop1);
//    	session.getTransaction().commit();
    	
    }
}
