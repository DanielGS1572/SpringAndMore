package EnumsConstruccionYUso;

public class App {

	public static void main(String[] args) {
		for(Season s: Season.values()) {
			System.out.println(s.name() + " - " + s.ordinal());
		}
		/*Se pueden asignar de dos formas un enum, de forma directa o con valueOf*/
		Season s1 = Season.WINTER;
		Season s2 = Season.valueOf("SPRING");
		
		System.out.println(s1 + " ... " + s2);
		
		switch(s2) {
/*Cuando se hace un switch con enums no es necesario poner la clase pues java ya sabe de forma implicita a traves del 
 * parámetro del switch, los enums a pesar de tener .ordinal() que dan el valor en entero, no se pueden comparar contra
 * enteros (a menos que se le pase como parametro al switch(s2.ordinal())*/
		case WINTER:		
			System.out.println("Winter (switch)");
			break;
		case SPRING:
			System.out.println("SPRING (switch)");
			break;
		case FALL:
			System.out.println("Fall (switch)");
			break;
		case SUMMER:
			System.out.println("Summer (switch)");
			break;
		default:
			System.out.println("none");
		}
	}

}
