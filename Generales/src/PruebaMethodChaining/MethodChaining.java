package PruebaMethodChaining;

public class MethodChaining {
	private String name;
	private int age;

	public MethodChaining setAge(int age) {
		this.age = age;
		return this;
	}
	public MethodChaining setName(String name) {
		this.name = name;
		return this;
	}
	
	
}
