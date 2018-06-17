package NestedClases.MemberInnerClass;

public class StaticNestedClass {
	public static class Test{
		public void show(){
			System.out.println("test");
		}
	}
	
	public static void main(String [] args){
		Test test = new Test();
		test.show();
	}
	
}
