package Cap2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class OptionalExample {
    public static void main(String[] args){
        List<String> lista = Arrays.asList("M","B","X");
        Optional<String> optional = lista.stream().filter(e -> e.startsWith("C")).findFirst();
        System.out.println(optional);

        /*orElse    -> public T orElse(T other)                         -> si el optional esta empty regresa other
        * orElseGet -> public T orElseGet(Supplier<? extends T> other)  -> si el optional esta empty regresa lo que regrese el supplier*/
        System.out.println(optional.orElse("None"));
        System.out.println(optional.orElse(String.format("No result found in %s",lista.stream().collect(Collectors.joining(",")))));
        Supplier<String> supplier = () -> String.format("No result found in %s",lista.stream().collect(Collectors.joining(",")));
        System.out.println(optional.orElseGet(supplier));

        /*orElseThrow recibe un supplier que solo se ejecuta si ocurre una excepción -- Supplier<X extends Exception>*/
        /*Objects.requireNonNull(T obj, Supplier<String> messageSupplier) --> solo se ejecuta el supplier si el primer objeto es nulo*/
    }
}
