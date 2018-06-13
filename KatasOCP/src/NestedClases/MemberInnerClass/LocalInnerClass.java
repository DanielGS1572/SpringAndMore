package NestedClases.MemberInnerClass;

public class LocalInnerClass {
	public int calcula(){
		int width = 5;
		class Inner{
			int multiplica(int valor){
				return valor*width;
			}
		}
		Inner inner = new Inner();
		return inner.multiplica(8);
	}

	public static void main(String args[]){
		LocalInnerClass lIC = new LocalInnerClass();
		System.out.println(lIC.calcula());
	}
}
