package com.Daniel.SpringTelusko.SpringAnnotations1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	
	@Bean						
	public Samsung getPhone() {
		return new Samsung();
	}
	
	@Bean
	public Processor getSnapDragon() {
		return new SnapDragon();
	}
}
