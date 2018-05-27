package FactoryPattern;

public class Hay extends Food{

	 Hay(int quantity) {
		super(quantity);
	}

	@Override
	public void consumed() {
		System.out.println("Hay eaten: " + getQuantity());
	}
	
}
