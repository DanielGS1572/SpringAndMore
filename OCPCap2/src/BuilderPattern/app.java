package BuilderPattern;

import java.util.Arrays;

public class app {
	public static void main(String args[]){
		AnimalBuilder animalBuilder = new AnimalBuilder();
		
		System.out.println(
animalBuilder.setAge(14).setSpecies("especie1").setFavoriteFood(Arrays.asList("comida1","comida2")).build()
		);
		System.out.println();

		System.out.println(
new AnimalBuilder().setAge(11).setSpecies("especie2").setFavoriteFood(Arrays.asList("comida3","comida4")).build()
		);
	}
}
