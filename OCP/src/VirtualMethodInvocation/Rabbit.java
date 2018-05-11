package VirtualMethodInvocation;

public class Rabbit extends Animal{
	String name = "Conejo";
	@Override
	void feed() {
	
		feedTheRabbit();
	}
	
	private void feedTheRabbit() {
		System.out.println("Feed the rabbit");
	}

}
