package ImplementingConsumerBiConsumer;

import java.util.HashMap;
import java.util.Map;
import java.util.function.*;

/*Consumer se usa cuando se quiere hacer algo con un parametro pero no regresar nada. BiConsumer es lo mismo pero con dos parametros
 * 
 * 
 * @FunctionalInterface
 * public class Consumer<T>{
 * 	void accept(T t);
 * }
 * 
 * @FunctionalInterface
 * public class Consumer<T, U>{
 * 	void accept(T t, U u);
 * }
 * */


public class ConsumerBiConsumer {

	public static void main(String[] args) {
		
		/*CONSUMER*/
		Consumer<String> c1 = System.out::println;
		Consumer<String> c2 = x -> System.out.println(x);
		
		c1.accept("Annie1");
		c1.accept("Annie2");
		System.out.println();
		/*BICONSUMER*/
		Map<String,Integer> map = new HashMap<>();
		BiConsumer<String,Integer> b1 = map::put;							/*Ver que el biconsumer es una forma de intermediario para acceder al map*/
		BiConsumer<String,Integer> b2 = (k,v) -> map.put(k, v);				/*LAMBDA VERSION*/
		
		b1.accept("Chicken", 7);
		b2.accept("Chicken2", 127);				/*Ver que esto tambien afecta al map, a traves de otro BiConsumer*/
			
		System.out.println(map);
		System.out.println(b1);			/*Ver la diferencia de los prints, uno es un mapa y otro un biconsumer*/
	}

}
