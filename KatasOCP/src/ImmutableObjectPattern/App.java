package ImmutableObjectPattern;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		List<String> name = new ArrayList<>();
		name.add("dos");
		name.add("uno");
		Animal animal = new Animal(15,name);
		System.out.println(animal);
		name.add("tres");
		System.out.println(animal);

	}

}
