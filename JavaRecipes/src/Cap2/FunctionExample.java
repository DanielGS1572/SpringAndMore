package Cap2;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.ToIntFunction;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FunctionExample {

    public static void main(String[] args){
        /*Metodos
        * - default <V> Function<T,V> andThen(Function<? super R, ? extends V> after)
        * - R apply(T t)
        * - default <V> Function<V,R> compose(Function<? super V, ? extends T> before)
        * static <T> Function<T,T> identity()*/

        List<String> names = Arrays.asList("Mal","Wash","Kaylee","Inara","Zoe","Jayne","Simon","Shepherd Book");
        List<Integer> nameLength = names.stream().map(new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return s.length();
            }
        }).collect(Collectors.toList());

        Function<String,Integer> funcion1 = s -> s.length();
        List<Integer> nameLength2 = names.stream().map(funcion1).collect(Collectors.toList());

//        Creo que no se puede hacer method reference con un Function
//        List<Integer> nameLength3 = names.stream().map(Function::apply).collect(Collectors.toList());

        System.out.println(nameLength);
        System.out.println(nameLength2);


        /* - Otras funciones: (dado que int no puede ser un generico por ser primitivo se tienen funciones especializada para tipo de
        datos primitivos)
         * IntFunction R apply(int value)
         * DoubleFunction R apply(double value)
         * LongFunction R apply(long value)
         *
         * Los ToXXFunction, regularmente se usan para metodos que aceptan como argumento un lambda que retorna un Long
         * ToIntFunction int applyAsInt(T value)
         * ToDoubleFunction double applyAsDouble(T value)
         * ToLongFunction long applyAsLong(T value)*/

        IntFunction<String> intFunction = s -> Integer.toString(s);
        intTest(intFunction);

        ToIntFunction<String> toIntFunction = s -> s.length();
        IntStream nameLength3 = names.stream().mapToInt(toIntFunction);

        /*-UnaryOperator recibe un tipo de dato y regresa el mismo tipo*/
        System.out.println("UnaryOperator");
        UnaryOperator<String> operator = s -> s + s;
        System.out.println(operator.apply(" - "));

    }

    public static void intTest(IntFunction function){
        System.out.println("IntFunction");
        System.out.println(function.apply(10));
    }
}
