package FactoryPatternClient;

import FactoryPattern.Food;
import FactoryPattern.FoodFactory;

public class Client {
	public static void main(String args[]){
			FoodFactory ff = new FoodFactory();
			Food food = ff.create("one");
			System.out.println(food.getQuantity());
	}
}
