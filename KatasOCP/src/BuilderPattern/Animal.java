package BuilderPattern;

import java.util.List;

public class Animal {
	public int age;
	public String name;
	public List<String> listFood;
	
	
	public Animal(int age, String name, List<String> listFood) {
		this.age = age;
		this.name = name;
		this.listFood = listFood;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getListFood() {
		return listFood;
	}
	public void setListFood(List<String> listFood) {
		this.listFood = listFood;
	}

	@Override
	public String toString() {
		return "Animal [age=" + age + ", name=" + name + ", listFood=" + listFood + "]";
	}
	
	
}
