package com.luv2code.springdemo;

public class TrackCoach implements Coach {
	private FortuneService fortuneService;
	public TrackCoach() {
	
	}	
	public TrackCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	@Override
	public String getFortune() {
		return "TrackCoach " + fortuneService.deliverFortune();
	}

	
	//add an init method
	public void doMyStartupStuff(){
		System.out.println("trackCoach: inside doMyStartupStuff method");
	}
	
	
	//add a destroy method
	public void doCleanUpStuff(){
		System.out.println("trackCoach: inside doCleanUpStuff");
	}
	
}
