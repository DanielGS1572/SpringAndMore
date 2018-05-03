package com.Daniel.SpringTelusko.SpringAnnotations1;

import org.springframework.beans.factory.annotation.Autowired;

public class Samsung {
	@Autowired
	Processor cpu;		/*Como nada mas lo implementa la clase de Snapdragon es el que inyecta*/
	
	
	
	public Processor getCpu() {
		return cpu;
	}



	public void setCpu(Processor cpu) {
		this.cpu = cpu;
	}



	public void config() {
		System.out.println("samsung");
		cpu.processorSpec();
	}
}
