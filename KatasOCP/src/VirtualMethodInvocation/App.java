package VirtualMethodInvocation;

public class App {

	public static void main(String[] args) {
		Animal lionAnimal = new Lion();
		Animal rabbitAnimal = new Rabbit();
		
		Lion lion = new Lion();
		
		lionAnimal.getText();
		System.out.println(lionAnimal.name);
		System.out.println(((Lion)lionAnimal).name);
		
	}

}
