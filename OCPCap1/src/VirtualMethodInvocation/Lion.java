package VirtualMethodInvocation;

public class Lion extends Animal{
	String name = "Leon";
	@Override
	void feed() {
		
		feedTheLion();
	}

	private void feedTheLion() {
		System.out.println("feed the lion");
	}
}
