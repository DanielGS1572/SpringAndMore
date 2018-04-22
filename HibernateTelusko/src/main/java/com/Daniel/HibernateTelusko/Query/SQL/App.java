package com.Daniel.HibernateTelusko.Query.SQL;

import java.util.List;
import java.util.Map;

import org.hibernate.Criteria;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class App {
	public static void main(String args[]) {
		
	
		

		
		Configuration config = new Configuration().configure().addAnnotatedClass(Student.class);
		ServiceRegistry registry = new ServiceRegistryBuilder().applySettings(config.getProperties()).buildServiceRegistry();
		SessionFactory sf = config.buildSessionFactory(registry);
		Session session = sf.openSession();
		
		session.beginTransaction();
		/* PARA GENERAR LOS DATOS*/
//		Random r = new Random();
//		for(int i = 1; i<= 50; i++){
//			Student student = new Student();
//			student.setName("Name " + i);
//			student.setRollno(i);
//			student.setMarks(r.nextInt(1000));
//			session.save(student);
//		}
		
		
//		SQLQuery query = session.createSQLQuery("select * from student_sql where marks > 60");
//		query.addEntity(Student.class);		/*Se debe de setear el entity*/
//		List<Student> list = query.list();
//		
//		for(Student l : list){
//			System.out.println(l);
//		}
	
		
		/*Para el caso que no se quiera el objeto completo*/
		SQLQuery query2 = session.createSQLQuery("select name,marks from student_sql");		/*--> Native query*/
		query2.setResultTransformer(Criteria.ALIAS_TO_ENTITY_MAP);		/*Genera mapa de llave valor*/
		List students = query2.list();
		
		for(Object s: students){
			Map map = (Map)s;
			System.out.println(map.get("name") + " : " + map.get("marks"));
		}
		session.getTransaction().commit();
	}
	

}
