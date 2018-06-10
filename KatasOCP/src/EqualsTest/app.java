package EqualsTest;

public class app {

	public static void main(String[] args) {
		ObjetoUno objUno = new ObjetoUno();
		ObjetoDos objDos = new ObjetoDos();
		objUno.setId(1);
		System.out.println(objUno.equals(objDos));
		System.out.println();
		
		objDos.setId(1);
		System.out.println(objUno.equals(objDos));

	}

}
