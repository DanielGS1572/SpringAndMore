package Streams;

import java.util.stream.Stream;

public class StreamsExampleOf {
/*Los streams se deben de pensar como un flujo de datos en los que pueden llegar a ser infinitos
*Importa mucho el orden ya que si un filtrado deja pasar siempre datos, es posible que la ejecucion se quede colgada
*
*/
	public static void main(String[] args) {
		/*Aqui se queda colgado porque el filter siempre dejara pasar todos los "Elsa" que se estan generando, de esta forma se hace 
		 * infinito y se colgaría la aplicación*/
//		Stream.generate(() -> "Elsa").filter(n -> n.length() == 4).sorted().limit(2).forEach(System.out::println);
		/* en cambio si el limit se pone despues del filter ya no se quedaría colgada*/	
		Stream.generate(() -> "Elsa").filter(n -> n.length() == 4).limit(2).sorted().forEach(System.out::println);
	}
}
