package VirtualMethodInvocation;

public class Lion extends Animal {

	@Override
	public void test() {
		go();
	}

	
	public void go() {
		System.out.println("Lion");
	}
}
