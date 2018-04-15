package SOLID.LISKOV;
/*Ver comentarios de la clase B*/
public class A {
	A fun(){
		System.out.println("I'm in A");
		return new A();
	}
}
