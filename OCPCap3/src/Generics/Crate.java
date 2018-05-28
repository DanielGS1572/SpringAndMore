package Generics;


/* La nomenclatura para genericos es la siguiente
 * E.- para elementos
 * K.- para elementos key de un map
 * V.- para elementos value de un map
 * N.- para numeros
 * T.- para datos de tipo generico
 * S,U,V.- para todo lo demas
 * */

/*Los genericos se usarn regularmente cuando se quiere trabajar con objetos que no tienen absolutamente ninguna
 * relación entre sí, dentro de una jaula, puede ir un elefante, una zebra, un robot etc. sin tener la 
 * necesidad de tener una interfaz que los conecte de alguna manera*/
public class Crate<T> {
	private T contents;
	public T emptyCrate(){
		return contents;
	}
	
	public void packCrate(T contents){
		this.contents = contents;
	}
}
