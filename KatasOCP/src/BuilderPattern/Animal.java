package BuilderPattern;

import java.util.List;

public class Animal {
	public int age;
	public String name;
	
	public Animal(int age, String name){
		this.age = age;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Animal [age=" + age + ", name=" + name + "]";
	}
	
	
}
