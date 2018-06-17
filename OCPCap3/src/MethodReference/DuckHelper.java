package MethodReference;

import java.util.Comparator;

public class DuckHelper {
	public static int compareByWeight(Duck d1, Duck d2){
		return d1.getWeight() - d2.getWeight();
	}
	
	public static int compareByName(Duck d1, Duck d2){
		return d1.getName().compareTo(d2.getName());
	}
	public static void main(String[] args) {
		/*A pesar de usar lambda aun asi sigue presentando algo de redundancia, pues el metodo
		 * recibe algo especifico (en este caso es Duck)*/
		Comparator<Duck> byWeight = (d1,d2) -> DuckHelper.compareByName(d1, d2);
		
		/*Por lo que otra forma de lograrlo es con method reference (::), ver que despues de los dos puntos
		 * es un metodo lo que se pone*/
		Comparator<Duck> byWeight2 = DuckHelper::compareByWeight;		/*Lo que regresa realmente es una 
		interfaz funcional y no un entero (OCP xodo: 205, libro 153)*/
	}

}
