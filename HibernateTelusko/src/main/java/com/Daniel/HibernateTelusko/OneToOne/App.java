package com.Daniel.HibernateTelusko.OneToOne;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class App {
	public static void main(String args[]) {
		
		Laptop laptop = new Laptop();
		laptop.setLid(101);
		laptop.setLname("Dell");
		
		Student student = new Student();
		student.setName("Daniel");
		student.setRollno(1);
		student.setMarks(50);
		student.setLaptop(laptop);
		
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
