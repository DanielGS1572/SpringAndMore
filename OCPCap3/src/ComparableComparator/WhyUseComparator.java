package ComparableComparator;

import java.util.*;
import java.util.Comparator;

/*A veces se quisiera ordenar elementos que no implementan comparable en la clase, o se quieren ordenar de forma distinta*/
/*Comparator se usa cuando se quiere ordenar de una forma particular o cuando el objeto no implementa la interfaz comparable*/
/*Ver clase Duck... (implementa Comparable)*/
public class WhyUseComparator {
		public static void main(String[] args) {
			/*clase "interna" de una interfaz, que se le pasa como parametro al Collections.sort, ver que es un COMPARATOR, no un Comparable
			 * Ademas Comparable debe ser implementado en la clase a comparar
			 * Ver que Comparator el metodo es compare(2 parametros) y Comparable es compareTo(1 parametro)*/
			
			Comparator<Duck> byWeight = new Comparator<Duck>() {
				public int compare(Duck d1, Duck d2) {			/*Se dice implement y no override por tratarse de una interfaz*/
					return d1.getWeight() - d2.getWeight();
				}
			};
			
			/*Comparator es una interfaz funcional (solo tiene un metodo) por lo que se puede escribir también como*/
			Comparator<Duck> byWeight2 = (d1,d2)-> d1.getWeight()-d2.getWeight();	/*Ver que no se le pasa el nombre del metodo a sobreescribir, ni el tipo de retorno*/
			
			List<Duck> ducks = new ArrayList<>();
			ducks.add(new Duck("Quack",7));
			ducks.add(new Duck("Puddles",10));
			Collections.sort(ducks);					/*Originalmente ordena por nombre pues asi esta implementado con el Comparable*/
			System.out.println(ducks);
			Collections.sort(ducks, byWeight2);		
			System.out.println(ducks);
		}
}
