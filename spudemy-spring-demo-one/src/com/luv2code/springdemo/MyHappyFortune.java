package com.luv2code.springdemo;

public class MyHappyFortune implements FortuneService {

	@Override
	public String deliverFortune() {
		return "Happy fortune";
	}

}
