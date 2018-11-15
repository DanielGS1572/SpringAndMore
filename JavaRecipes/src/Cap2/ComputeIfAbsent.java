package Cap2;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Stream;

public class Varios {

    public static void main(String args[]){
/*ComputIfAbsent solo sirve para los casos que el valor no esta presente, no sirve para la llave*/
        Map<Integer,String> mapa = new HashMap<>();
        mapa.put(1, "uno");
        mapa.put(2, "dos");
        mapa.put(3, "tres");
        mapa.put(4, "cuatro");
        mapa.put(5, "cinco");
        mapa.put(6, null);
        Function<Integer,String> func = e -> "kuatro";
        mapa.computeIfAbsent(6,func);
        System.out.println(mapa);
        Function.<Double>identity();        //Es como si fuera un genérico t -> t ... recibe un objeto de tipo t y lo regresa
//        transformado, para no tener que declarar variables final
    }
}
