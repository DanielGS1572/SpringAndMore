package EqualsTest;

public class app {

	public static void main(String args[]) {
		ObjetoDos obj2 = new ObjetoDos();
		ObjetoUno obj1 = new ObjetoUno();
		
		obj2.setId(1);
		obj1.setId(2);
		
		System.out.println(obj2.equals(obj1));
		
		System.out.println();

		obj2.setId(1);
		obj1.setId(1);
		
		System.out.println(obj2.equals(obj1));
		
		
	}
}
