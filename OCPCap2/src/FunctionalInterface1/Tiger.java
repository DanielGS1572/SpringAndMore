package FunctionalInterface1;

public class Tiger implements Sprint {

	@Override
	public String sprint(Object animal) {
		System.out.println("Animal is sprintig fast" + animal.toString());
		return "ok";
	}

}
