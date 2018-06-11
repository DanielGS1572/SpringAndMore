package NestedClases.MemberInnerClass;

public class StaticNestedClass {
	/*public*/ static class Clase{
		public int valor = 6;
	}
	
	public static void main(String[] args) {
		Clase clase = new Clase();
		System.out.println(clase.valor);
		
		/*StaticNestedClass staticNestedClass = new StaticNestedClass();
		staticNestedClass.new Clase();*/
	}

}
