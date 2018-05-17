package NestedClasses.MemberInnerClass;

public class AnonymousInnerClassWithInterface {
	public int admission(int basePrice) {
		SaleTodayOnly sale = new SaleTodayOnly() {
			public int dollarsOff() {		//Las interfaces requieren modificadores de acceso tipo
//											public cada que se implemente
				return 3;
			}
		};
		return basePrice - sale.dollarsOff();
	}
	
	public static void main(String args[]) {
		AnonymousInnerClassWithInterface x = new AnonymousInnerClassWithInterface();
		System.out.println(x.admission(10));
	}
}
