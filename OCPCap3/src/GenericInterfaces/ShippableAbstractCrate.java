package GenericInterfaces;
/*La otra forma es que la interfaz reciba un generico*/
public class ShippableAbstractCrate<U> implements Shippable<U>{

	@Override
	public void ship(U t) {
		
	}
		
}
