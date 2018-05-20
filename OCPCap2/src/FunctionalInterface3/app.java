package FunctionalInterface3;

import java.util.function.Function;

public class app {
	public static int realizaSuma(int a, int b, Calculator c){
		return c.calculate(a, b);
	}
	public static void main(String[] args) {
		Calculator sumUp = (a,b) -> a+b;		/*Aqui se define que es lo que hara la 
		interfaz funcional, es decir se implementa, ver que el nombre de la 
		interfaz funcional es un nombre generico, pues todavia no se sabe exactamente
		que es lo que hará. Sin embargo cuando se implementa el nombre de la variable
		es sumUp, ya se define que se hará*/
		
		System.out.println(realizaSuma(4, 5, sumUp));	/*Ver que se le pasa como
		parametro la varialbe de la interfaz implementada, de esta forma
		realizaSuma se define en (a,b) -> a+b */
		
		
		Mensaje m = (msg)->System.out.println("Curso de " + msg);
		m.mensaje("Java");
		
		
		/*caso "raro" de una interfaz funcional
		 * Function<T,R> 
		 * 		T.- Viene siendo lo que recibe como parametro, en este caso sería (s)
		 * 		R.- Es lo que regresa como valor
		 * Para hacer uso de función es necesario usar .apply
		 * https://www.youtube.com/watch?v=CWDuzK7h7y8*/
		Function<int[],String> funcion = (s) ->{
			int elementos = s.length;
			return "La cantidad de elementos es " + elementos;
		};
		int [] arr = {13,15,17};
		System.out.println(funcion.apply(arr));
	}
	

}
