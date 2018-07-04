package VirtualMethodInvocation;

public class App {

	public static void main(String[] args) {
		Animal r = new Rabbit();
		Animal l = new Lion();
		r.test();
		l.test();
	}

}
