package Cap2;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PredicateExample {
        public static void main(String[] args){
            /*Tiene varios metodos default, un metodo estatico y un Functional interface:
            * default Predicate<T> and(Predicate<? super T> other)
            * static <T> Predicate<T> isEquals(Object targetRef)
            * default Predicate<T> negate()
            * default Predicate<T> or(Predicate<? super T> other)
            * boolean test(T t)*/

            System.out.println(getNamesOfLength(3,"abc","a","abcd","aei"));
            System.out.println(getNamesOfLengthWithPredicate(s -> s.length() == 3,"abc","a","abcd","aei"));

            List<String> lista = Arrays.asList("ab","ed","eee");
            Predicate<String> predicate = s -> s.length() == 2;

            System.out.println("PartitioningBy");
            /*Separa los elementos que si cumple con los criterios con los que no*/
            Map<Boolean,List<String>> mapa = lista.stream().collect(Collectors.partitioningBy(predicate));


            System.out.println("allMatch");
            System.out.println(lista.stream().anyMatch(predicate));         /*Ver también allMatch --> todos los elementos deben de coincidir para que regrese true*/
        }
        public static String getNamesOfLength(int length, String... names){
            return Arrays.stream(names).filter(s -> s.length() == length).collect(Collectors.joining(", "));
        }
        public static String getNamesOfLengthWithPredicate(Predicate<String> predicate, String... names){
        return Arrays.stream(names).filter(predicate).collect(Collectors.joining("- "));
    }
}
