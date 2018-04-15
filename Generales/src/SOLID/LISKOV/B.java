package SOLID.LISKOV;
/*Los covariant returns se relacionan con el principio de sustitucion de Liskov
 * y es que fun() se le esta haciendo override pues extiende de A y A tiene el mismo metodo
 * (resulta que si se quita el extends, viene siendo un metodo especifico de B, se quitaria 
 * el triangulo ver que dice que se le esta haciendo override)
 * Ademas el return type cambia pues se regresa un objeto hijo*/
public class B extends A{
	B fun(){		
		System.out.println("I'm in B");
		return new B();
	}
}
