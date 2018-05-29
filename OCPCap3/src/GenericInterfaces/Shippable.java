package GenericInterfaces;

/*Hay tres formas de utilizar interfaces genericas en las clases*/


/*En los genericos no se puede:
 * Hacer un arreglo de tipo estatico pues por el type erasure se estarian creando un arreglo de Objects
 * No se puede hacer un instanceof a List<Integer> o a List<String> pues para java sería lo mismo por el type erasure
 * No se pueden usar primitivos
 * Type erasure.- es cuando se usan genericos, java por atras lo relaciona como si fuera un Object
 * (En los genericos ya no es necesario hacer casteo)
 * */
public interface Shippable<T> {
	void ship(T t);
}
