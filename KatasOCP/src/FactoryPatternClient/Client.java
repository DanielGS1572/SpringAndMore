package FactoryPatternClient;

import FactoryPattern.Food;
import FactoryPattern.FoodFactory;

public class Client {
	public static void main(String args[]){
		Food f1 = FoodFactory.getFood("fish");
		f1.getConsumed();
	}
}
