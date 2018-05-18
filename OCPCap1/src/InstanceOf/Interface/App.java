package InstanceOf.Interface;

public class App {
/*Cuando se hace instanceof sobre una clase la revisión de si proviene de una misma referencia vs objeto se hace 
 * a nivel de compilación
 * 
 * Pero cuando se trata de una interfaz se hace durante run-time*/
	
	public static void main(String args[]) {
		
		HeavyAnimal hippo = new Hippo();
		System.out.println(hippo instanceof Mother);			/*Esto se permite pues no hace el check en compile time*/
		
	}
}
