package VirtualMethodInvocation;

public class Rabbit extends Animal{

	@Override
	public void test() {
		go();
		
	}

	public void go() {
		System.out.println("rabbit");
	}
}
