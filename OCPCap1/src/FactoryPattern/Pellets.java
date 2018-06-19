package FactoryPattern;

public class Pellets extends Food {

	public Pellets(int quantity) {
		super(quantity);
	}

	@Override
	public void getQuantity() {
		System.out.println("Pellets eaten " + quantity);
		
	}

}
