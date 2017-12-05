package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortunService {

	@Override
	public String getFortune() {
		return "Happy fortune service";
	}

}
