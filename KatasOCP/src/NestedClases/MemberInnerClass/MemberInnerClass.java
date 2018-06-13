package NestedClases.MemberInnerClass;

public class MemberInnerClass {
	class Test{
		public void out(){
			System.out.println("a");
		}
	}
	public void muestra(){
		Test test = new Test();
		test.out();
		
	}
	public static void main(String args[]){
		MemberInnerClass miC = new MemberInnerClass();
				miC.muestra();
				miC.new Test().out();
	}

}
