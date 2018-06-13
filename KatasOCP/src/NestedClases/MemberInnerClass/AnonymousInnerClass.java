package NestedClases.MemberInnerClass;

public class AnonymousInnerClass {
	class SalesToday{
		 int getValue(){
			return 3;
		}
	}
	public int getAdmision(int base){
		SalesToday sales = new SalesToday(){
			 int getValue(){
				return 8;
			}
		};
		return base - sales.getValue();
	}
	public static void main(String [] args){
		AnonymousInnerClass aIC = new AnonymousInnerClass();
		System.out.println(aIC.getAdmision(10));
	}
}
