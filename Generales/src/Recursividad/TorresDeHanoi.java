package Recursividad;

/*Cuando se programa de forma recursiva es necesario establecer un caso base, en el que no se 
nesecita recurrir de nuevo, por ejemplo para el caso del factorial https://youtu.be/lilBGvaOSy8?t=52s
*/

/*
 * 	Para la Torre de Hanoi el caso base es mover un solo disco de la torrer origen a la destino
 * sin pasar por la torre auxiliar
 * 
 * Cada disco representa un numero donde el numero mayor es el disco mas grande
 * */

/*
 * La recursion se basa en tener un caso base para resolver una funcion de funciones,
 * por ejemplo f(f(f(a))) donde f(a) = 5+a, en este caso la recursion la define f(a)
 * que es simplemente irle sumando 5 a a
 * */
public class TorresDeHanoi {
	public static void main(String args[]){
		TorresDeHanoi obj = new TorresDeHanoi();
		obj.torresHanoi(3,1,2,3);
	}
	public void torresHanoi(int discos, int torre1, int torre2, int torre3){
		if(discos == 1){
			System.out.println("disco de torre " + torre1 + " a torre " + torre3);
		}else{			
			torresHanoi(discos-1,torre1,torre3,torre2);
			System.out.println("disco de torre " + torre1 + " a torre " + torre3);		/*Porque si se llega a ejecutar esta linea?*/
			torresHanoi(discos-1,torre2,torre1,torre3);
		}
	}

}
