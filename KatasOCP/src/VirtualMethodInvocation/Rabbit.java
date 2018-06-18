package VirtualMethodInvocation;

public class Rabbit extends Animal{

	@Override
	public void getText() {
		getSnif();
	}
	
	public void getSnif(){
		System.out.println("snif snif");
	}
	
}
