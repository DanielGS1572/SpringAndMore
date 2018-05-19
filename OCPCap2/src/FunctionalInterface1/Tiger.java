package FunctionalInterface1;

public class Tiger implements Sprint {

	@Override
	public void sprint(Object animal) {
		System.out.println("Animal is sprintig fast" + animal.toString());
	}

}
