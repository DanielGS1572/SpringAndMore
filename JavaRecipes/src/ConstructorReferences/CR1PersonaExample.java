package ConstructorReferences;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CR1PersonaExample {
	public static void main(String[] args) {
		List<Person> listaPersonas = Arrays.asList(new Person("nombre1"),new Person("nombre2"),new Person("nombre3"),new Person("nombre4"));
		/*Suponiendo que se tiene una lista de personas se quiere crear una nueva lista que contenga sus nombres*/
		List<String> listaNombres1 = listaPersonas.stream().map(person -> person.getName()).collect(Collectors.toList());			/*Version lambda*/
		List<String> listaNombres2 = listaPersonas.stream().map(Person::getName).collect(Collectors.toList());						/*Version method reference*/
		
		List<String> listaNombres = Arrays.asList("nombreA","nombreB","nombreC");
		/*Pero para hacerlo de forma contraria se usaría un constructro reference*/
		List<Person> listaPersonas1 = listaNombres.stream().map(name -> new Person(name)).collect(Collectors.toList());
		List<Person> listaPersonas2 = listaNombres.stream().map(Person::new).collect(Collectors.toList());							/*Como el contexto proporciona un solo string es lo que se usa para crear el constructor*/
		
		System.out.println(listaPersonas2);
		/*Lista de nombre a arreglo*/
		List<String> listaNombresArreglo = Arrays.asList("nombreA","nombreB","nombreC");
		Person[] people = listaNombresArreglo.stream().map(Person::new).toArray(Person[]::new);			/*para crear un arreglo en lugar de collect(Collectors.toList() se pone toArray(Person[]::new*/
		
	}

}
