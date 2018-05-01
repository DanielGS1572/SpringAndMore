package com.Daniel.SpringTelusko.DependencyInjection;

public class Car implements Vehicle {
	public void drive()
	{
		System.out.println("drive a car");
	}
	public void test() {			/*Si se intentara usar este metodo en el programa principal no lo reconoceria pues la referencia es la interfaz*/
		System.out.println("test");
	}
}
