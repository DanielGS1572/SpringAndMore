package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Coach theCoach = context.getBean("thatSillyCoach", Coach.class);
		Coach alphaCoach = context.getBean("thatSillyCoach", Coach.class);
		System.out.println(theCoach == alphaCoach);
		System.out.println(theCoach.getDailyWorkout());
		context.close();
	}

}
