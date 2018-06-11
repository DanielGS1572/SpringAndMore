package NestedClases.MemberInnerClass;

public class MemberInnerClass {
	class Test{
		public String getResult(){
			return "tested";
		}
	}
	
	public void returnStdOut(){
		Test test = new Test();
		System.out.println(test.getResult());
	}
	public static void main(String[] args) {
		MemberInnerClass memberInnerClass = new MemberInnerClass();
		memberInnerClass.returnStdOut();
		System.out.println(memberInnerClass.new Test().getResult());

	}

}
