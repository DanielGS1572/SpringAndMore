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
	void method(){
		System.out.println("hey");
	}
}

class B extends A{
	B(){
		super(3);					/*Manda llamar el constructor que tiene parametro (debe ser llamado primero)*/
		super.method(); 			/*Manda llamar el metodo del padre*/
		System.out.println("B");
	}
}
