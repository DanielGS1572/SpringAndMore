package NestedClases.MemberInnerClass;

public class StaticNestedClass {
	static class Test{
		public void muestra(){
			System.out.println("test");
		}
	}
	
	public static void main(String args[]){
		Test test  = new Test();
		test.muestra();
	}
}
