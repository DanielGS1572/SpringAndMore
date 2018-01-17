package DataStructures;

public class Arrays {
	public static void main(String args[]) {
		//Declarar
		int[] myIntArray1 = new int[3];
		myIntArray1[0] = 3;
		
		//Declarar e inicializar sin especificar el tamaño
		int[] myIntArray2 = {1,2,3};
		
		//Declarar e inicializar sin especificar el tamaño
		int[] myIntArray3 = new int[] {1,2,3};
		
		
		//Para el caso que simplemente se declare...
		int[] myIntArray4;
		
			//se pueden agregar asi 
			myIntArray4 = new int[] {1,2,3,4};
			myIntArray4 = new int[] {1,2,3,4,5};	//ver que se puede planchar de nuevo los valores
			System.out.println(myIntArray4.length); //recordar que para ver el tamaño se usa la propiedad length
			System.out.println();
		for(int i=0;i<myIntArray4.length;i++) {
			System.out.println(myIntArray4[i]);
		}
		
		for(int i:myIntArray4) {
			System.out.println("Second " + i);
		}
	}
}
