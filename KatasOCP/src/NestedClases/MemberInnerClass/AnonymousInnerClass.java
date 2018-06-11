package NestedClases.MemberInnerClass;

public class AnonymousInnerClass {
	protected class Price{
		public int finalPrice(){
			return 3;
		}
	}
	
	public int finalDiscountPrice(int percentage){
		Price price = new Price(){
			public int finalPrice(){
				return 5;
			}
		};
		return percentage - price.finalPrice();
	}

	public static void main(String[] args) {
		AnonymousInnerClass aIC = new AnonymousInnerClass();
		System.out.println(aIC.finalDiscountPrice(8));
		Price price = aIC.new Price();		//acceso a una LocalInnerClass
		
	}

}
