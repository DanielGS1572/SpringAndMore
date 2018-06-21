package BuilderPattern;

import java.util.List;

public class AnimalBuilder {
	public int age;
	public String name;
	
	public AnimalBuilder setAge(int age){
		this.age = age;
		return this;
	}
	
	public  AnimalBuilder setName(String name){
		this.name = name;
		return this;
	}
	
	public Animal build(){
		return new Animal(this.age, this.name);
	}
}
