package NestedClases.MemberInnerClass;

public class AnonymousInnerClassWithInterface {
	public int getAdmision(int ticketPrice){
		SalesTodayOnly sales = new SalesTodayOnly(){
			public int dollarsOff(){
				return 5;
			}
		};
		return ticketPrice - sales.dollarsOff();
	}

	public static void main(String[] args) {
		AnonymousInnerClassWithInterface x = new AnonymousInnerClassWithInterface();
		System.out.println(x.getAdmision(8));
	}

}
