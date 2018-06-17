package InstanceOf.InterfacePractice;

public class App {

	public static void main(String[] args) {
		Elephant el = new Elephant();
		System.out.println(el instanceof Mother);
		Hipo hipo = new Hipo();
		System.out.println(hipo instanceof Mother);
	}

}
