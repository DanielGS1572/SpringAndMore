package Pruebas;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class MethodReference {
    public static void main (String[] args){
        Stream.of(1,3,2,4).forEach(System.out::println);

        Supplier<Double> supplier = Math::random;
        Consumer<Double> consumer = System.out::println;
        Consumer<Integer> consumer2 = System.out::println;

        Stream.generate(supplier).limit(3).forEach(consumer);

        Function<String,Integer> function = String::length;
        Stream.of("aaA","bb","c").map(function).forEach(consumer2);
    }
}
