package GenericMethods;

public class Crate<T> {
	
	/*Regularmente los metodos genericos se definen como estatic para usarlos dentro de una misma clase*/
	
	/*3 formas distintas de definir metodos genericos*/
	public static <T> Crate<T> ship(T t){	/*Regresa un objeto generico*/
		return new Crate<T>();
	}
	
	public static <T> void sink(T t){
		
	}
	
	public static <T> T identity(T t){
		return t;
	}
	
	
	/*Ver como en todos los casos antes del tipo de valor de retorno lleva <T>*/
	
}
