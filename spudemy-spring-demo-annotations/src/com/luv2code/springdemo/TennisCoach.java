package com.luv2code.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("thatSillyCoach")
public class TennisCoach implements Coach {
	@Autowired // --> Field injection
	@Qualifier("randomFortuneService")
	private FortunService fortuneService;
	//Constructor injection
	
	public TennisCoach() {
			System.out.println(">> inside default constructor");
	}
	
	//define my init method
	@PostConstruct
	public void doMyStartupStuff() {
		System.out.println(">> TennisCoach: inside of  doMyStartupStuff");
	}
	
	//define my destroy method
	@PreDestroy
	public void doMyCleanupStuff() {
		System.out.println(">> TennisCoach: inside of  doMyCleanupStuff");
	}
	
	
	//CONSTRUCTOR INJECTION
//	@Autowired
//	public TennisCoach(FortunService theFortuneService) {
//		fortuneService = theFortuneService;
//	}
	
	//SETTER INJECTION
//	@Autowired
//	public void setFortuneService(FortunService theFortuneService) {
//		System.out.println("inside the setFortuneService");
//		this.fortuneService = theFortuneService;
//	}
	
	@Override
	public String getDailyWorkout() {
		return "Tennis Coach getDailyWorkout()";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	

}
