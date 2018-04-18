package com.Daniel.HibernateTelusko.OneToMany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class App {
	public static void main(String args[]) {
		/*Borrar los datos de la tabla para probar*/
		/*Si no deja borrar desde mysql poner:
		 * 
			SET FOREIGN_KEY_CHECKS=0;*/
		
		
		Laptop laptop = new Laptop();
		laptop.setLid(103);
		laptop.setLname("Dell");
		
		Student student = new Student();
		laptop.setStudent(student);					/*Se debe de setear el estudiante para la laptop, como la laptop para el estudiante, de lo contrario no guardaria bien los datos*/
		
		student.setName("Daniel");
		student.setRollno(3);
		student.setMarks(50);
		student.getLaptopList().add(laptop);
		
		Configuration config = new Configuration().configure().addAnnotatedClass(Student.class).addAnnotatedClass(Laptop.class);
		ServiceRegistry registry = new ServiceRegistryBuilder().applySettings(config.getProperties()).buildServiceRegistry();
		SessionFactory sf = config.buildSessionFactory(registry);
		Session session = sf.openSession();
		
		session.beginTransaction();
		session.save(laptop);
		session.save(student);
		
		session.getTransaction().commit();
	}
	

}
