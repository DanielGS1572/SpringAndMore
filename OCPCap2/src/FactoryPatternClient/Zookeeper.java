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
		la obtención de la información
		
		*Cada animal podria tener su propio obtjeto y su propio metodo consumed 
		*pero estaría altamente acoplado y se tendría una clase por cada
		*tipo de animal*/
		food.consumed();
	}

}
