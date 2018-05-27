package FactoryPattern;

public class FoodFactory {
	public static Food getFood(String animalName){	
/*Como este metodo se indica que retornara algo y si nada mas se pone return en los case,
 * manda error de compilación, pero si se lanza una excepción en lugar de un return sí compila bien*/
		switch(animalName){
		case "zebra": return new Hay(100);
		case "rabbit": return new Pellets(5);
		case "goat": return new Pellets(30);
		case "polar bear": return new Fish(10);
		}
		throw new UnsupportedOperationException("Unsupported animal: " + animalName);
		
		
	}
}
