package Generics3;

public class ArrayExample {
	/*En lugar de tener metodos que hacen overload de las firmas para que reciba un String, un int y demas
	 * se puede crear un metodo de forma generica*/
	public static <E,T> E[] printArray(E[] arreglo, T otroGenerico){ /*Se pueden recibir dos parametros genericos*/
		for(E elemento: arreglo){
			System.out.print(elemento + " "); 	/*La desventaja es que nada mas se pueden acceder a metodos de tipo Object*/
		}
		return arreglo;
	}
	public static void main(String args[]){
		String [] arregloString = {"a","b","c"};
		Integer [] arregloInteger = {1,2,3,4,5};
		int [] arregloPrimitivo = {1,2,3};
		printArray(arregloString, new String("para cumplir con firma"));
		System.out.println("");
		printArray(arregloInteger, new String("para cumplir con firma"));
		//printArray(arregloPrimitivo, new String("para cumplir con firma"));	/*Solo acepta objetos*/
	}
}
