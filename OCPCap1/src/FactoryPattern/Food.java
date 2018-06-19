package FactoryPattern;

public abstract class Food {
	protected int quantity;
	public Food(int quantity){
		this.quantity = quantity;
	}
	public abstract void getQuantity();
	
	
}
