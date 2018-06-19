package FactoryPattern;

public class FoodFactory {
	public Food returnFood(String animal){
		switch(animal){
		case "deer": return new Pellets(100);
		}
		throw new IllegalStateException(); 
	}
	
}
