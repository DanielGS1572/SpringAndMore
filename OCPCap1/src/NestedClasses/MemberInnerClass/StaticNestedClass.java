package NestedClasses.MemberInnerClass;

public class StaticNestedClass {
	static class Nested{
		public int price = 6;
	}
	
	public static void main(String[] args){
		Nested nested = new Nested();			//No es necesario instanciar
//		a la clase principal para despues acceder a Nested, no funciona Nested.price
		System.out.println(nested.price);
	}
}
