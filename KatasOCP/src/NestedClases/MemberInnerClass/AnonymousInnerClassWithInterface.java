package NestedClases.MemberInnerClass;

public class AnonymousInnerClassWithInterface {
	
	public int getDollarsOff(int base){
		SalesTodayOnly sales = new SalesTodayOnly() {
			
			@Override
			public int dollarsOff() {
				// TODO Auto-generated method stub
				return 10;
			}
		};
		return sales.dollarsOff() - base;
	}
	
	public static void main(String args[]){
		AnonymousInnerClassWithInterface a = new AnonymousInnerClassWithInterface();
		System.out.println(a.getDollarsOff(211));
	}
}
