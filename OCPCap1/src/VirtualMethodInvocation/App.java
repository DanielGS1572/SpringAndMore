package VirtualMethodInvocation;

/*
 * Virtual Method Invocation se refiere a que se mandará llamar el metodo que ha sido overriden,
 * ver que no pasa con los campos de los objetos
 * */


public class App {
	public static void main(String args[]) {
		Animal leon = new Lion();
		Animal conejo = new Rabbit();
		
		conejo.feed();
		System.out.println(conejo.name);
	}
}
