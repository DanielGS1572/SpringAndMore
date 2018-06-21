package BuilderPattern;

import java.util.Arrays;
import java.util.List;

public class app {

	public static void main(String[] args) {
		Animal animal = new AnimalBuilder().setAge(15).setName("name").build();
		System.out.println(animal);
	}

}
