package FactoryPattern;

public class Fish extends Food {

	public Fish(int quantity) {
		super(quantity);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void getConsumed() {
		System.out.println("Fish consumed " + getQuantity());
		
	}

	
		
}
