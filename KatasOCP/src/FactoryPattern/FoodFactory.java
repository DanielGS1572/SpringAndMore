package FactoryPattern;

public class FoodFactory {
	public static Food getFood(String food){
		
		switch(food){
		case "fish": return new Fish(10);
		case "hay": return new Hay(20);
		}
		throw new UnsupportedOperationException("No existe");
	}
}
