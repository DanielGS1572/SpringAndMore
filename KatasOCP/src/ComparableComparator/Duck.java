package ComparableComparator;

public class Duck implements Comparable {
	public int age;
	public String name;
	public int getAge() {
		return age;
	}
	
	public Duck(int age,String name) {
		this.age = age;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Duck [age=" + age + ", name=" + name + "]";
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
	@Override
	public int compareTo(Object o) {
		Duck obj = (Duck)o;
		return this.getAge() - obj.getAge();
	}
	
	
}
