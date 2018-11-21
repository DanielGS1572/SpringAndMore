package Factory;

import java.awt.Color;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public interface Factory<T> extends Supplier<T> {//1.18.42 https://youtu.be/64UO1YjVcZ0
	//IntStream.range genera un conjunto de enteros que van de 0 a n, despues es mapeado a un objeto
	default List<T> get(int n){
		return IntStream.range(0, n).mapToObj(i -> this.get()).collect(Collectors.toList());
	}
	static Factory<Circle> create(Function<Color,Circle> constructor, Color color){
		return () -> constructor.apply(color);		 	//Ver que aqui mezcla un Function y un supplier
		//Segundo concepto mas importante de functional programming... partial application
		//el primero es composition
	}
}
