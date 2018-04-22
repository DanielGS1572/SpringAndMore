package com.Daniel.HibernateTelusko.Query.HQL1;



import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class App 
{
    public static void main( String[] args )
    {
    	Alien telusko = new Alien();
    	Alien telusko2 = new Alien();
       
       Configuration con = new Configuration().configure().addAnnotatedClass(Alien.class);  /*.configure, lee el archivo de configuracion que se encuentra dentro de src, addAnnotatedClass para que lea las anotaciones del archivo */
       ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
       SessionFactory factory = con.buildSessionFactory(reg);
       Session session1	= factory.openSession();		
       Transaction tx = session1.beginTransaction();
//	/******Para guardar********/
//       telusko.setAid(101);
//       AlienName aN = new AlienName();
//       aN.setFname("Daniel");
//       aN.setLname("Gonzali");
//       aN.setMname("Saucedo");
//       telusko.setAlienName(aN);
//       telusko.setColor("Green");
//     session1.save(telusko);       
//       tx.commit();
///******Para obtener valores de la base de datos******/
       
       /*Para hacer un query tipo sql ya no se usa get, sino createQuery*/
       Query q1 = (Query)session1.createQuery("from Alien where aid=101");
       q1.setCacheable(true);
//       telusko = (Alien) session1.get(Alien.class, 101);			//ya no se usa
       telusko = (Alien)q1.uniqueResult();
       
       System.out.println(telusko);
       session1.close();
       
       Session session2 = factory.openSession();		
       session2.beginTransaction();
       Query q2 = session2.createQuery("from Alien where aid=101");
       q2.setCacheable(true);
       telusko2 = (Alien) q2.uniqueResult();			
       System.out.println(telusko);
       session2.close();
       
    }
}
