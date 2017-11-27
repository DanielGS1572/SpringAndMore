package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		//load the sprign configuration file
		//(crear el container)
		ClassPathXmlApplicationContext  context = 
				new ClassPathXmlApplicationContext("applicationContext.xml"
						/*Nombre del archivo de configuración xml*/); 
		
		//retrieve de bean from the containter
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		//call the methods on the bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getFortune());
		//close the context
		context.close();

	}

}
