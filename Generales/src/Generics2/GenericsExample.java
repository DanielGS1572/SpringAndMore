package Generics2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.DoubleAccumulator;

import org.junit.Test;

public class GenericsExample {
	
	// Los genericos regularmente se usan para los DAOs (Create, Read, Update, Delete)
	// Buscar Don't reapeat the DAOs, articulo de IBM
	public void betterForCasting() {

		// Caso 1
		// Se tiene una lista "cruda" en la que si se quiere obtener algun
		// elemento
		// se debe de castear, por el add lo que hace es agregar elementos de
		// tipo Object
		List rawList = new ArrayList();

		rawList.add("elemento1");
		rawList.add("elemento2");

		String el1 = (String) rawList.get(0);

		// Caso 2
		// Aqui no hay problema porque ya se esta acotando
		List<String> list = new ArrayList<>();
		list.add("elemento1");
		list.add("elemento2");

		String s1 = list.get(0);

		// Caso 3
		// se puede tener una lista de listas en la que unicamente se le
		// pone el operador diamante
		Map<Integer, List<String>> mapa = new HashMap<>();
	}

	public void boxesTest() {
		// Caso 4
		// Ver como se puede acotar una lista que contiene objetos con genericos
		List<Box<String>> boxes = new ArrayList<>();
		Box<String> box1 = new Box();
		box1.setObj("elemento 1 de Box");
		Box<String> box2 = new Box();
		box2.setObj("elemento 2 de Box");
		// Ver que no hay problema porque los objetos son compatibles
		boxes.add(box1);
		boxes.add(box2);

		// marca error @CompileTime --> box1.inspect("123");
		box1.inspect(123);
	}

	public void usingPairs() {
		Pair<String, String> p1 = new OrderedPair<>("aKey", "aValue");
		Pair<Integer, String> p2 = new OrderedPair<>(1, "aValue");
	}

	// Caso 5
	// wildcards --> regularmente se usa en collections List<? extends Number>, 
	//----------- super casi no se usa, si se setteara o getter se recomienda no usar wildcards
	//----------- y se recomienda usar como sumOfNumbers2
	// hay varias formas de usarlo:
	// (1) <? extends Number> pasa lo que sea, que no es tan diferente que <T>
	// Tambien se puede hacer como con el metodo sumOfNumbers2,
	// pero así lo hace menos flexible (de alguna manera)
	// la palabra extends se refiere a que realmente es extends o que implemente
	
	
	public void sumOfNumbers(List<? extends Number> numbers) {
		double d = 0.0;
		for (Number n : numbers) {
			d += n.doubleValue();
		}
		System.out.println(d);
	}
	// (2) Se puede usar super en lugar de extends, lo que hace es que en lugar de acotar
	// hacia abajo, acota hacia arriba pero no es buena idea en terminos de obtener 
	// informacion, pues es necesario usar Object
	//------ Usar extends cuando se quiere hacer GET de informacion
	//------ Usar super cuando se quiere hace SET de información
	//-- De alguna forma como que no funciona por (x)

	//bounds -- super upper bound -- extends lower bounds
	public void addNumbersToList(List<? super Integer> numbers) {
		numbers.add(1);
		// numbers.add(2L); -- marca error porque no esta en la jerarquia
		// numbers.add(new Object()); (x)
		for(Object n: numbers){
			System.out.println(n.getClass().getName());
		}
	}

	// Se usa @Test cuando se realizará una accion, se necesita la libreria de
	// JUnit
	// import org.junit.Test;
	@Test
	public void showSumOfNumbers() {
		sumOfNumbers(Arrays.asList(1, 2, 3));
		sumOfNumbers(Arrays.asList(5.3, 6.3, 3.7));
		sumOfNumbers(Arrays.asList(5L, 6L, 3L));
	}

	public <T extends Number> void sumOfNumbers2(List<T> numbers) {
		double d = 0.0;
		for (Number n : numbers) {
			d += n.doubleValue();
		}
		System.out.println(d);
	}

}
