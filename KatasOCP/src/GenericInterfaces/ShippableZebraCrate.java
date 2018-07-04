package GenericInterfaces;



public class ShippableZebraCrate<Zebra> implements Shippable<Zebra>{

	@Override
	public void ship(Zebra t) {
		System.out.println("Zebra shipped");
	}

	

	
	
}
