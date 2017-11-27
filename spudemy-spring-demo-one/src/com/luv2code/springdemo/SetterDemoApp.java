package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		// load spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		// retrieve bean from spring container
			CricketCoach theCoach = context.getBean("myCricketCoach", CricketCoach.class);
		// call methdos
			System.out.println(theCoach.getDailyWorkout());
			System.out.println(theCoach.getFortune());
			System.out.println(theCoach.getEmail());
			System.out.println(theCoach.getTeam());
		// close context
			context.close();
	}

}
