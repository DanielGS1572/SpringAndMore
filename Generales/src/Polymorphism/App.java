package Polymorphism;
/*Lo mismo se puede hacer que las clases extiendan de Insect (ésta siendo una clase y no una interfaz)
 * pero se haria override al metodo*/
public class App {
	public static void main(String args[]){
		Insect[] listaInsectos = new Insect[3];   /*Ver como la referencia es la interfaz*/
		
		listaInsectos[0] = new Beetle();
		listaInsectos[1] = new Roach();
		listaInsectos[2] = new Spider();
		
		for(Insect a:listaInsectos){
			System.out.println(a.eat());
		}
		
	}
}
