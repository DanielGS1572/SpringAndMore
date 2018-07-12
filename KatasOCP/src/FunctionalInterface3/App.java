package FunctionalInterface3;

public class App {

	public static void main(String[] args) {
		RealizaCalculo realiza = (a,b) -> a*b; 
		System.out.println(realiza.calculo(2, 4));
		
		Mensaje m = (x)->System.out.println("prueba " + x);
		m.muestra("test");
		
		
	}

}
