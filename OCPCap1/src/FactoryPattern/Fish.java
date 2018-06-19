package FactoryPattern;

public class Fish extends Food{

	public Fish(int quantity) {
		super(quantity);
	}

	@Override
	public void getQuantity() {
		System.out.println("Fish eaten " + quantity );
	}
	
	
	

}
