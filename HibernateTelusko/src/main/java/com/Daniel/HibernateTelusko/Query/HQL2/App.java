package com.Daniel.HibernateTelusko.Query.HQL2;

import java.util.List;

import org.hibernate.Query;
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
		Query q = session.createQuery("from Student where rollno=7");	/*Student es el entity name, no el nombre de la tabla*/
//		List<Student> students = q.list();	/*Obtiene la lista cuando el hql es "session.createQuery("from Student")"*/
		Student student = (Student)q.uniqueResult();
		System.out.println(student);
		
		/*Se puede especificar en el query qué columnas se quieren obtener, pero al no ser el objeto completo pues se le pueden pasar
		 * columnas incompletas del pojo, regresa un arreglo de tipo Object con los datos*/
		Query q2 = session.createQuery("select rollno,name,marks from Student where rollno=7");
		Object[] studentArray = (Object[]) q2.uniqueResult();
		for(Object s: studentArray){
			System.out.println(s);
		}
		
		/*Para obtener una lista sería List<Object[]>*/
		
		Query q3 = session.createQuery("select rollno,name,marks from Student");
		List<Object[]> studentsArray2 = (List<Object[]>) q2.list();
//		for(Object s: studentArray2){
//			System.out.println(s);
//		}
		
		/*	OTROS QUERIES*/
		/*Uso de alias*/ session.createQuery("select rollno,name,marks from Student s where s.marks > 60");
		/*Uso de calculos*/ session.createQuery("select sum(rollno) from Student s where s.marks > 60");
		/*Positional parameter*/
		int b = 60;
		session.createQuery("select sum(rollno) from Student s where s.marks > :b"); /*el colon lo reconoce como positional parameter (también se pudo haber concatenado con +b)*/
		q.setParameter("b", b);
		session.getTransaction().commit();
	}
	

}
