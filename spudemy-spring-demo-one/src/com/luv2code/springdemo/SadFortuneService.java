package com.luv2code.springdemo;

public class SadFortuneService implements FortuneService {

	@Override
	public String deliverFortune() {
		return "Sad fortune service";
	}

}
