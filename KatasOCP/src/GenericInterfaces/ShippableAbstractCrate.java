package GenericInterfaces;

public class ShippableAbstractCrate<T> implements Shippable<T>{

	@Override
	public void shipt(T t) {
		System.out.println("ship");
		
	}

	
		
}
