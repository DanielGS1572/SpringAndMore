package NestedClases.MemberInnerClass;

public class LocalInnerClass {
	public int getPrice(int dollarsOff){
		class BasePrice{
			public int getBase(){
				return 5;
			}
		}
		BasePrice base = new BasePrice();
		return dollarsOff - base.getBase();
	}
	public static void main(String args[]){
		LocalInnerClass l = new LocalInnerClass();
		System.out.println(l.getPrice(3));
	}
	
}
