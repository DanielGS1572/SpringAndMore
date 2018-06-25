package FactoryPattern;

public class FoodFactory {
		public Food create(String animal){
			switch(animal){
			case "one": return new Fish(20);
			case "two": return new Hay(10);
			}
			throw new IllegalArgumentException();
		}
}
