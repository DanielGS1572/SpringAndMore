package FunctionalInterface3;

public class App {

	public static void main(String[] args) {
		RealizaCalculo c = (a,b)-> a*b;
		System.out.println(c.calculo(4, 5));
		
		Mensaje m = me -> "mensaje " + me;
		System.out.println(m.muestra("test"));
	}

}
