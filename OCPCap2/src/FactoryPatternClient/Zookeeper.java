package FactoryPatternClient;

import FactoryPattern.Food;
import FactoryPattern.FoodFactory;
import FactoryPattern.Hay;

public class Zookeeper {

	public static void main(String[] args) {
		final Food food = FoodFactory.getFood("polar bear");
//		Hay hay = new Hay(10); 
		/*No se puede instanciar Hay pues la visibilidad es package protected
		se hace de esta manera para que se haga a traves de un FoodFactory
		la obtenci�n de la informaci�n
		
		*Cada animal podria tener su propio obtjeto y su propio metodo consumed 
		*pero estar�a altamente acoplado y se tendr�a una clase por cada
		*tipo de animal*/
		food.consumed();
	}

}
