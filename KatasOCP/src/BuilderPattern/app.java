package BuilderPattern;

import java.util.Arrays;
import java.util.List;

public class app {

	public static void main(String[] args) {
		AnimalBuilder builder = new AnimalBuilder();
		List<String> listaComida = Arrays.asList("comida1","comida2","comida3");
		Animal animal = builder.setAge(15).setName("name").setListFood(listaComida).build();
		System.out.println(animal);

	}

}
