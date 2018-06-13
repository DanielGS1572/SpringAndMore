package NestedClases.MemberInnerClass;

public class AnonymousInnerClassWithInterface {
	
	
	public int getDiscount(int base){
		SalesTodayOnly sales = new SalesTodayOnly() {
			
			@Override
			public int dollarsOff() {
				// TODO Auto-generated method stub
				return 20;
			}
		};
		System.out.println(sales.getClass());
		return base - sales.dollarsOff();
	}
	public static void main(String args[]){
		AnonymousInnerClassWithInterface test = new AnonymousInnerClassWithInterface();
		test.getDiscount(30);
	}
}
