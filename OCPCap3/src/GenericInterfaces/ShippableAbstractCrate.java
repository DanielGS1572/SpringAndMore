package GenericInterfaces;
/*La otra forma es que la interfaz reciba un generico*/
public class ShippableAbstractCrate<U> implements Shippable<U>{			/*Aqui se puede definir el tipo de parametro que recibe cuando se esta instanciando
 																		y lo que hace es restringir, en este caso ya no deja poner el tipo de objeto con el que
 																		se trabajará pues al instanciarlo no recibe parametros el operador diamante*/

	@Override
	public void ship(U t) {
		
	}
		
}
