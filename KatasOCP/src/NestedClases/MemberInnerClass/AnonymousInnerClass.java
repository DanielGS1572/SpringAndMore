package NestedClases.MemberInnerClass;

public class AnonymousInnerClass {
	class BasicTicket{
		public int getBaseEntrance(){
			return 5;
		}
	}
	
	public int getTotalPrice(int dollars){
		BasicTicket basic = new BasicTicket(){
			public int getBaseEntrance(){
				return 8;
			}
		};
		return basic.getBaseEntrance() + dollars;
	}
	public static void main(String args[]){
		AnonymousInnerClass a = new AnonymousInnerClass();
		System.out.println(a.getTotalPrice(10));
	}
}
