package BinarySearchExample;

import java.util.Arrays;
import java.util.Collections;		/*Ver que se usa CollectionS y no Collection, ya que esta ultima
 es una interfaz y no puede tener metodos concretos*/
import java.util.List;

public class BinarySearchExample {
	private static List<Integer> lista = Arrays.asList(9,7,5,3);  /*Un objeto de tipo List no puede usar
	primitivos List<int>*/
	public static void main(String args []){
		Collections.sort(lista);		/*Para poder hacer uso se Collections.binarySearch 
		 es necesario primero tener una lista ordenada*/
		for(Integer x : lista){
			System.out.print(x);
			
			System.out.print(", ");
		}
		System.out.println();
		System.out.println("Resultado de la busqueda");
		System.out.println(Collections.binarySearch(lista, 4));		/*Como no lo encuentra,
		una posicion anterior al 3 es el -1 y conforme va avanzando entre los elementos se le va restando 1
		por lo que -2 significa que 4 no fue encontrado y debería estar entre el 3 y el 5*/
		System.out.println(Collections.binarySearch(lista, 3));			/*Se usa -1 porque el primer elemento
		siempre esta en la posición 0*/
		
		
	}
}
