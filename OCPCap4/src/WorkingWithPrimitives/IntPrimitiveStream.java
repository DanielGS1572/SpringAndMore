package WorkingWithPrimitives;

import java.util.OptionalDouble;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class IntPrimitiveStream {

	public static void main(String[] args) {
			Stream<Integer> stream = Stream.of(1,2,3);
			IntStream intStream1 = stream.mapToInt(x -> x);
			System.out.println(intStream1.sum());
			
			
			/*Para calcular un promedio por ejemplo se complicaria ya que los streams solo permiten una sola pasada, por lo que para realizar calculos
			 * comunes como por ejemplo el promedio existe un metodo que lo haga*/
			IntStream intStream2 = IntStream.of(1,2,3);
			OptionalDouble avg = intStream2.average();
			System.out.println(avg.getAsDouble());
			
			/*Existen 3 tipos de streams primitivos
			 * - IntStream 			--> int, short, byte, char
			 * - LongStream			--> long
			 * - DoubleStream		--> double and float
			 * 
			 * 			metodos importantes
			 * 			- .empty()
			 * 			- .of(a,b,c)
			 * */
			System.out.println();
			DoubleStream empty = DoubleStream.empty();
			DoubleStream varargs = DoubleStream.of(1.0,1.1,1.2);
			varargs.forEach(System.out::println);
			
			/*Tambien estan disponibles los dos metodos que se tienen con Stream generate e iterate*/
			DoubleStream random = DoubleStream.generate(Math::random);
			DoubleStream fractions = DoubleStream.iterate(.5, d -> d/2);		/*Empieza con .5 y va dividiendo de dos en dos cada resultado (a partir de .5)*/
			
			System.out.println();
			random.limit(3).forEach(System.out::println);
			System.out.println();
			fractions.limit(3).forEach(System.out::println);
			
			/*Range*/
			System.out.println();
			IntStream range = IntStream.range(1, 6);			/*No incluye el 6, es mejor que usar el iterate (es menos codigo)*/
			range.forEach(System.out::println);
			
			
			System.out.println();
			IntStream rangeClosed = IntStream.rangeClosed(1, 5);
			rangeClosed.forEach(System.out::println);
			
			
	}

}
