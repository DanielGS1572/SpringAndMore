package FunctionalInterface1;

/*La anotacion de @FunctionalInterface es para que la interfaz ya no acepte
 * metodos abstractos (sin embargo si pueden agregarse metodos concretos
 * (ver las interfaces Run, SprintFaster, Skip)
 * 
 * Si se rompe con la regla que no cumple con que sea una interfaz funcional
 * no sería posible usarla en expresiones lambda*/

@FunctionalInterface
public interface Sprint {
	public Object sprint(Object animal);
}
