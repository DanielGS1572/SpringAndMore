package com.Daniel.SpringTelusko.SpringAnnotations2;

import org.springframework.stereotype.Component;

@Component
public class SnapDragon implements Processor {

	public void processorSpec() {
		System.out.println("I'm a SnapDragon");

	}

}
