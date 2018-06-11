package NestedClases.MemberInnerClass;

public class LocalInnerClass {
	private int width = 5;
	public int calculate(){
		int length = 10;
		class Multiply{
			int calculateMultiplication(){
				return length*width;
			}
		};
		Multiply calculateMult = new Multiply(); 
		return calculateMult.calculateMultiplication();
	}
	public static void main(String[] args) {
		LocalInnerClass localInnerClass = new LocalInnerClass();
		System.out.println(localInnerClass.calculate());
	}

}
