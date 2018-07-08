package FactoryPattern;

public class Hay extends Food{

	public Hay(int quantity){
		super(quantity);
	}
	@Override
	public void getConsumed() {
		System.out.println("Hay consumed " + getQuantity());
		
	}
	
}
