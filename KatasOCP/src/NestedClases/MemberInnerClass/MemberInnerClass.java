package NestedClases.MemberInnerClass;

public class MemberInnerClass {
	public class Test{
		public void show(){
			System.out.println("test");
		}
	}
	
	public void showSecond(){
		Test test = new Test(){
			public void show(){
				System.out.println("test2");
			}
		};
		test.show();
	}
	
	public static void main(String []args){
		MemberInnerClass m = new MemberInnerClass();
		m.new Test().show();
	}
}
