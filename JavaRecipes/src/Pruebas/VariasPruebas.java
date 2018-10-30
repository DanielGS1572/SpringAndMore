package Pruebas;

import ConstructorReferences.Person;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class VariasPruebas {
    public static void main(String[] args){
        Stream.of(3,2,5,1).forEach(x -> System.out.print(x));

        System.out.println();

        Consumer<Integer> consumer = System.out::print;
        Stream.of(3,2,5,1).forEach(consumer);

        System.out.println();

        Function<String,Integer> function = String::length;
        Stream.of("Esto","es","una","cadena").map(function).forEach(System.out::print);

        System.out.println();
        List<String> lista = Stream.of("esto","es","una","cadena","z","b","d","a").sorted((s1, s2)->s1.compareTo(s2)).collect(Collectors.toList());
        System.out.println(lista);

        System.out.println();
        List<String> lista2 = Stream.of("esto","es","una","cadena","z","b","d","a").sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(lista2);

        List<Persona> listaPersona = Arrays.asList(new Persona("uno"),new Persona("dos"),new Persona("tres"));
        List<String> listaString = listaPersona.stream().map(Persona::getNombre).collect(Collectors.toList());
        System.out.println(listaString);

        List<Persona> listaMapped = listaString.stream().map(Persona::new).collect(Collectors.toList());
        System.out.println(listaMapped);

        Supplier<Double> supplier = Math::random;
        Stream.generate(supplier).limit(5).sorted(Comparator.naturalOrder()).forEach(System.out::println);

        List<String> bonds = Arrays.asList("Connery","Lazenby","Moore","Dalton","Brosnan","Craig");
        bonds.stream().sorted(Comparator.comparingInt(String::length).thenComparing(Comparator.naturalOrder())).forEach(System.out::println);
    }
}
