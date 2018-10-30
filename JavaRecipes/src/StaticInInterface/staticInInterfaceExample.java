package StaticInInterface;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class staticInInterfaceExample {
    public static void main(String[] args){
        /*Static methods:
        * - No se puede hacer override
        * - El llamado se hace desde el nombre de la interfaz
        * - No es necesario implementar la interfaz para usar los metodos estaticos
        * - Los metodos estaticos deben de tener una implementación*/
        List<String> bonds = Arrays.asList("Connery","Lazenby","Moore","Dalton","Brosnan","Craig");
        List<String> sorted = bonds.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
        sorted.forEach(System.out::println);

        System.out.println();

        List<String> reverse = bonds.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        reverse.forEach(System.out::println);

        System.out.println();

        List<String> toLower = bonds.stream().sorted(Comparator.comparing(String::toLowerCase)).collect(Collectors.toList());
        toLower.forEach(System.out::println);

        System.out.println();

        List<String> orderBySize = bonds.stream().sorted(Comparator.comparingInt(String::length).thenComparing(Comparator.naturalOrder())).collect(Collectors.toList());
        orderBySize.forEach(System.out::println);
    }
}
