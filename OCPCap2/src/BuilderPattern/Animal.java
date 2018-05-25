package BuilderPattern;

import java.util.ArrayList;
import java.util.List;

public final class Animal {		/*En la clase se pone final para que no se pueda extender y hacer 
 								override a los metodos*/
		private final String species;
		private final int age;
		private final List<String> favoriteFood;  /*Aqui manda error de inicialización pero cuando 
		se iguala en el constructor ya se quita el error*/
		
		
		public Animal(int age, List<String> favoriteFood){
			this.species = "";
			this.age = age;
			this.favoriteFood = new ArrayList<String>(favoriteFood); /*CORRECTO, YA QUE SI SE LE PASA UNA LISTA
			DESDE FUERA, Y LA LISTA CAMBIA this.favoriteFood TAMBIÉN CAMBIARÍA*/ 
		}
		public Animal(List<String> favoriteFood){
			this.species = "";
			this.age = 0;
			this.favoriteFood = favoriteFood; 		/*INCORRECTO*/
		}
		public int getAge(){
			return age;
		}
		
		public List<String> getList(){
			return this.favoriteFood;
		}
		
		
		public Animal(String species,int age, List<String> favoriteFood){
			this.species = species;
			this.age = age;
			this.favoriteFood = new ArrayList<String>(favoriteFood);
		}
		@Override
		public String toString() {
			return "Animal [species=" + species + ", age=" + age + ", favoriteFood=" + favoriteFood + "]";
		}
		
		
}
