package GenericInterfaces;

public class ShippableAbstractCrate<T> implements Shippable<T>{

	@Override
	public void ship(T t) {
		System.out.println("shipped");
	}

	
		
}
