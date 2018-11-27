import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapVsFlatMap {
    public static void main (String args[]){

        List<String> myList = Stream.of("a", "b")
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(myList);
        //el FlatMap solo es para "aplanar" una lista de listas del mismo tipo
        List<List<String>> list = Arrays.asList(Arrays.asList("a","b","c"),Arrays.asList("c","d","e"));
        System.out.println(list);

        System.out.println(list.stream().flatMap(Collection::stream).collect(Collectors.toList()));
    }
}
