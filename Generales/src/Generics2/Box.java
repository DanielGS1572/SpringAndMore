package Generics2;

public class Box<T> {
	private T obj;

	public T getObj() {
		return obj;
	}

	public void setObj(T obj) {
		this.obj = obj;
	}
	
	//Bounded type parameter
	//Así es como se agrega un type parameter a un metodo
	//Se puede regresar de igual forma el generico en lugar del void
			//public <U> U inspect() -- o tambien -- public <U> String inspect()
	public <U extends Number> void inspect(U u){ //para inspecccionar el tipo que se le pasa
		System.out.println("T: " + obj.getClass().getName() );
		System.out.println("U: " + u.getClass().getName() );
	}
}
