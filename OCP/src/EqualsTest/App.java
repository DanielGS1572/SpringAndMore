package EqualsTest;


/*El equals debe ser sobre-escrito en la clase padre y se debe de tener cuidado que la firma
 * sea la siguiente
 * 
 * public boolean equals(Object obj)
 * 
 * De lo contrario no seria override, si no overload*/
public class App {
	public static void main(String args[]) {
		ObjetoUno objUno = null;
		ObjetoDos objDos = new ObjetoDos();
		
		System.out.println(objDos.equals(objUno));

		
		ObjetoUno objEjemplo = new ObjetoUno();
		objEjemplo.setId(1);
		objDos.setId(1);
		System.out.println(objEjemplo.equals(objDos));
	}
}
