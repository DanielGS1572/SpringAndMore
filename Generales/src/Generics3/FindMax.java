package Generics3;

public class FindMax {
	public static <T extends Comparable <T>> T findMax(T a, T b){ /*Comparable tiene el metodo compareTo */
		int n = a.compareTo(b);
		if(n < 0){
			return b;
		}else{
			return a;
		}
	}
	
	public static void main(String args[]){
		System.out.println(findMax(2, 3));	//Si se intentara mandar findMax(2, 3.0) manda error porque el argumento dice 
											//que recibe dos valores del mismo tipo T
		System.out.println(findMax(3, 3));
		System.out.println(findMax(3, 2));

		System.out.println();
		
		System.out.println(findMax(2.0, 3.0));
		System.out.println(findMax('a','b'));
		System.out.println(findMax("hello","there"));
	}
}
