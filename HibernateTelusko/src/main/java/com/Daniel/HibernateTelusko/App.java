package com.Daniel.HibernateTelusko;

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
       telusko.setAid(106);
       telusko.setAname("navin");
       telusko.setColor("Green");
       Configuration con = new Configuration().configure().addAnnotatedClass(Alien.class);  /*.configure, lee el archivo de configuracion que se encuentra dentro de src, addAnnotatedClass para que lea las anotaciones del archivo */
       ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
       SessionFactory factory = con.buildSessionFactory(reg);
       Session session	= factory.openSession();		/*Como Session es una interfaz se debe usar un Configuration para obtener el sessionFactory*/
       
       /*Cuando marca un error de hibernate.dialect, significa que hace falta la configuración de la base de datos*/
       /*Se debe de agregar un archivo xml de configuracion File -> new -> other -> y se busca hibernate, seleccionar el archivo cfg.xml*/
       
       Transaction tx = session.beginTransaction();
       session.save(telusko);
       tx.commit();
       
    }
}
