package Polymorphism;
/*Lo mismo se puede hacer que las clases extiendan de Insect (�sta siendo una clase y no una interfaz)
 * pero se haria override al metodo*/

//Nunca se tiene acceso como tal al objeto si no a la refrencia que apunta al objeto, y en realidad 
//el objeto nunca cambia sus propiedades, si no se agregan nuevas dependiendo de la referencia que 
//este apuntando a dicho objeto
public class App {
	public static void main(String args[]){
		Insect[] listaInsectos = new Insect[3];   /*Ver como la referencia es la interfaz*/
		
		listaInsectos[0] = new Beetle();
		listaInsectos[1] = new Roach();
		listaInsectos[2] = new Spider();
		
		for(Insect a:listaInsectos){
			System.out.println(a.eat());
		}
		/*Castear un objeto de una Subclase a una superclase no necesita casteo*/
		Object obj = new Beetle();
		((Beetle) obj).test();
		/*Castear un objeto de una superclase a una Subclase no necesita casteo*/
		Beetle obj2 = (Beetle) new Object();
	}
}
