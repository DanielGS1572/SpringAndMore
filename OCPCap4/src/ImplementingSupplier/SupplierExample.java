package ImplementingSupplier;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.function.Supplier;

/*Supplier se usa cuando se quiere generar o entregar valores sin ningun input, la definición de la interfaz es la siguiente:
 * @FunctionalInterface
 * public class Supplier<T>{
 * 		public T get();
 * }
 * 
 * Supplier regularmente se usa para construir nuevos objetos*/
public class SupplierExample {

	public static void main(String[] args) {
		
		Supplier<LocalDate> a1 = LocalDate::now;			/*--> static method reference*/
		Supplier<LocalDate> a2 = () -> LocalDate.now();
		
		Supplier<StringBuilder> s1 = StringBuilder::new;
		Supplier<StringBuilder> s2 = () -> new StringBuilder();
		
		System.out.println(a1.get()); 		/*El metodo get proviene de Supplier*/
		System.out.println(a2.get());
		
		System.out.println(s2);				//ImplementingSupplier.SupplierExample$$Lambda$4/1826771953@568db2f2 --> Paquete.Clase$$Objeto[Que no proviene de una clase, si no que esta en memoria]

		System.out.println();
		Supplier<ArrayList<String>> listSupplier = ArrayList<String>::new;
		ArrayList<String> listCreated = listSupplier.get();					/*Ver que listSupplier simplemente con un .get se puede crear objetos nuevos con una referencia nueva*/
		System.out.println(listCreated);
	}

}
