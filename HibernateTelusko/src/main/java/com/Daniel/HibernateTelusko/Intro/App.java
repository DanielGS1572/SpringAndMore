package com.Daniel.HibernateTelusko.Intro;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
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
    public static void main( String[] args )
    {
       Alien telusko = new Alien();
       
       Configuration con = new Configuration().configure().addAnnotatedClass(Alien.class);  /*.configure, lee el archivo de configuracion que se encuentra dentro de src, addAnnotatedClass para que lea las anotaciones del archivo */
       ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
       SessionFactory factory = con.buildSessionFactory(reg);
       Session session	= factory.openSession();		/*Como Session es una interfaz se debe usar un Configuration para obtener el sessionFactory*/
       
       /*Cuando marca un error de hibernate.dialect, significa que hace falta la configuración de la base de datos*/
       /*Se debe de agregar un archivo xml de configuracion File -> new -> other -> y se busca hibernate, seleccionar el archivo cfg.xml*/
       
       Transaction tx = session.beginTransaction();
	/******Para guardar********/
       telusko.setAid(101);
       AlienName aN = new AlienName();
       aN.setFname("Daniel");
       aN.setLname("Gonzali");
       aN.setMname("Saucedo");
       telusko.setAlienName(aN);
       telusko.setColor("Green");
     session.save(telusko);       
       tx.commit();
/******Para obtener valores de la base de datos******/
       telusko = (Alien) session.get(Alien.class, 105);
       
       System.out.println(telusko);
       
    }
}
