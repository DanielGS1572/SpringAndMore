package Super;

public class App {
	public static void main(String args[]){
		A b = new B();			/*No importa que la referencia apunte a A o a B, el resultado será el mismo*/
	}
}

class A{
	A(){
		System.out.println("A");
	}
	A(int i){
		System.out.println("A " + i);
	}
}

class B extends A{
	B(){
		super(3);					/*Manda llamar el constructor que tiene parametro*/
		System.out.println("B");
	}
}
