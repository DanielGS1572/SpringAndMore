package VirtualMethodInvocation;

public class Lion extends Animal {
	public String name = "lion";
	@Override
	public void getText() {
		roar();
	}
	public void roar(){
		System.out.println("roar");
	}
}
