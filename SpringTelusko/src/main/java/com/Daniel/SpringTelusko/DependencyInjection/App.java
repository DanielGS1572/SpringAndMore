package com.Daniel.SpringTelusko.DependencyInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	/*La inyección de dependencias basicamente es decirle a traves de la configuración
    	 * del archivo spring.xml que objeto quiero que se construya, sin tener que hardcodear
    	 * dentro de la clase (de lo contrario se tendria que estar RECOMPILANDO las clases*/
    	
    	/*Principio de inyección de dependencia, se desacopla el codigo
    	 * a traves de una interfaz y lo que hace 
    	 * es que a traves de appContext.getBean(clase que implemente vehiculo)
    	 * hace entrega del objeto*/
    	
    	/* El metodo de getBean proviene de :
    	 * 		- BeanFactory	--> para proyectos pequeños
    	 * 		- ApplicationContext --> para proyectos empresariales		--> superset de beanFactory */
//        Vehicle v = getBean("Vehicle");
    	
    	ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
    	Vehicle car = (Vehicle)context.getBean("car");	/*Cada que se pida por un vehiculo (que es una interfaz
    	 													se requiere que regrese un carro, para eso se debe de configurar
    	 													un archivo xml*/
    	Vehicle bike = (Vehicle)context.getBean("bike");
    	/*getBean("vehicle") --> la parte de "vehicle" es el id del bean dentro del archivo spring.xml */
        car.drive();
        bike.drive();
    }
}
