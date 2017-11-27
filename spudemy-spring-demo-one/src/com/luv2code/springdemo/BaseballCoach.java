package com.luv2code.springdemo;

public class BaseballCoach implements Coach {
	public FortuneService fortuneService;
	
	@Override
	public String getDailyWorkout(){
		return "Spend 30 minutes on batting practice";
	}
	public BaseballCoach(FortuneService fortuneService){
		this.fortuneService = fortuneService;
	}
	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return fortuneService.deliverFortune();
	}
}
