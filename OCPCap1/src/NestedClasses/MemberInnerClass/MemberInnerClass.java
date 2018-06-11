package NestedClasses.MemberInnerClass;
//es cuando se define a nivel "miembro" donde se definen los metodos, variables de instancia y constructores

//Puede usar los 4 modificadores de acceso: public, private, protected, default
//Puede extender de cualquier clase o implementar cualquier interfaz
//Puede acceder a los miembros privados dentro de la clase
//		NO puede declarar campos o metodos estaticos


//La UNICA diferencia con AnonymousInnerClass es que en lugar de hacer overload simplemente se 
//llama en uno de los metodos
public class MemberInnerClass {
	private String greeting = "Hi";
	
	protected class Inner{
		public int repeat = 3;
		public void go() {
			for(int i = 0; i<repeat; i++) {
				System.out.println(greeting);
			}
		}
	}
	
	public void callInner() {
		Inner inner = new Inner();
		inner.go();
	}
	
	public static void main(String [] args) {
		MemberInnerClass mIC = new MemberInnerClass();
		mIC.callInner();		//Debido a que la clase interna no es estatica debe ser accedida a traves de una instancia de la 
//								clase externa
		System.out.println("\nxxxxxxx\n");
		/* Otra forma extraña de instanciar una inner class, sería:*/
		Inner inner2 = mIC.new Inner();
		inner2.go();
	}
	
	//JAVA creará dos archivos
	//		- Outer.class
	//		- Outer$Inner.class		--> El signo de pesos denotando que es una clase interna
}
