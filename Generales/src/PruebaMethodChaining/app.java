package PruebaMethodChaining;

public class app {

	public static void main(String[] args) {
		MethodChaining methodChain = new MethodChaining();
		System.out.println(methodChain.setAge(14).setName("test"));
	}

}
