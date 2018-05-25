package BuilderPattern;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*El patron de diseño builder se usa para cuando por temas de mantenibilidad no se le quiere
 * ir metienedo nuevas propiedades a un constructor, que un segundo desarrollador vaya metiendo
 * pequeños cambios que a la larga se convierta en un anti-patron dificil de mantener. Una 
 * solucion podría ser usar los metodos setters, pero cuando se trate de un objeto inmutable
 * los setter no podrían existir. Y es que el problema del constructor es que los parametros
 * deben de ir en orden, sin embargo en el patron builder simplemente se hace un method
 * chaining y al final se hace un .build() Esto se hace a traves de una clase builder y es 
 * para usarse con objetos inmutables*/
public class AnimalBuilder {
	private String species;
	private int age;
	private List<String> favoriteFood;
	
	public AnimalBuilder setSpecies(String species){
		this.species = species;
		return this;
	}
	public AnimalBuilder setAge(int age){
		this.age = age;
		return this;
	}
	public AnimalBuilder setFavoriteFood(List<String> favoriteFood){
		this.favoriteFood = favoriteFood;
		return this;
	}
	
	public Animal build(){
		return new Animal(species, age, favoriteFood);
	}
}
