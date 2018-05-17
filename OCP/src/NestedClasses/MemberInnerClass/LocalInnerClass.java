package NestedClasses.MemberInnerClass;
//Es una clase definida dentro de un metodo y dicha clase
//no existe hasta que el metodo sea invocado, quiere decir
//que solo se pueden crear instancias dentro del metodo
//y dichas instancias pueden ser regresadas desde el metodo

//No tienen modificadores de acceso
//No pueden ser declaradas como static, ni metodos ni fields
//Tienen acceso a todos los campos y metodos de la clase
//Tiene acceso a variables de otros metodos simpre que sean final o effectively final
public class LocalInnerClass {
	private int length = 5;			//instance variable
	public void calculate() {
		/*final*/ int width=20;			//final local variable, si se quita la palabra
		
//		final y compila bien, toma por default effectively final
		//effectively final es cuando una variable se asigna un valor una sola vez
		//todas las variables son effectively final
		//si se asigna otra referencia deja de ser effectively final, por ejemplo
		//int one = 1, int two = one... two no es effectively final, pues one puede cambiar
		
//		width = 30; --> esta instrucción ya haría tronar a length*width
		class Inner{
			public void multiply() {
				System.out.println(length*width);
			}
		}
		Inner inner = new Inner();
		inner.multiply();
	}
	
	public static void main(String [] args) {
		LocalInnerClass outer = new LocalInnerClass();
		outer.calculate();
	}
}
	