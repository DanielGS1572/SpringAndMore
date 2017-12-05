package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("thatSillyCoach")
public class TennisCoach implements Coach {
	@Autowired // --> Field injection
	@Qualifier("happyFortuneService")
	private FortunService fortuneService;
	//Constructor injection
	
	public TennisCoach() {
			System.out.println(">> inside default constructor");
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
