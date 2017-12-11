package com.luv2code.springdemo;

public class SwimCoach implements Coach {

	private FortunService fortuneService;
	
	public SwimCoach(FortunService theFortuneService) {
		fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "SwimCoach -> getDailyWorkout";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
