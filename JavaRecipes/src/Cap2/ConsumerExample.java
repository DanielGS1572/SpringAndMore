package Cap2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ConsumerExample {

    public static void main(String[] args){
        /*El consumer recibe cualquier tipo de dato T, pero se puede ser especifico usando primitivos:
        * - IntConsumer         --> void accept(int x)
        * - DoubleConsumer      --> void accept(double x)
        * - LongConsumer        --> void accept(long x)
        * - BiConsumer          --> void accept(T t, U u)       --> Recibe como argumento dos tipos de datos genericos*/

        /*Además se tiene:
        * - ObjIntConsumer      --> void accept(T t, int x)     --> Recibe como primer parametro un generico y segundo parametro un int
        * ... lo mismo ocurre con los siguientes:
        * - ObjLongConsumer
        * - ObjDoubleConsumer*/

        /*forEachOrdered hace respetar el orden en un parallel, donde el forEach al tener el paralle no le importa*/
        Stream.of("AAA","BBB","CCC").parallel().forEach(s->System.out.println("Output:"+s));
        System.out.println();
        Stream.of("AAA","BBB","CCC").parallel().forEachOrdered(s->System.out.println("Output:"+s));

        /*Ejemplo peek*/
        System.out.println();
        List<Integer> lista = Arrays.asList(3,2,5,1);
        lista.stream().mapToDouble(Integer::intValue).peek(System.out::println).sum();
        System.out.println();
        Stream.of("bus", "car", "bycle", "flight", "train")
                .filter(e -> e.length() > 3)
                .peek(e -> System.out.println("Filtered value: " + e))
                .map(String::toUpperCase)
                .peek(e -> System.out.println("Mapped value: " + e))
                .collect(Collectors.toList());
    }


}
