package EnumsMetodosAbstractos;

public enum Seasons {
		WINTER("helloWinter"){
			public void getNumber(){
				System.out.println("Winter");
			}
			public void getChacha(){
				System.out.println("cha cha");
			}
			
		},
	
		AUTUMN("HELLO AUTUMN"){
			public void getChacha(){
				System.out.println("cha cha");
			}
			@Override
			void getNumber() {
				System.out.println("AUTUMN");
				
			}
			
			
		};
	
		private String hello;
		private Seasons(String hello){
			this.hello = hello;
		}
		public String getHello(){
			return hello;
		}
		public void getCha(){
			System.out.println("ch");
		}
		abstract void getNumber();
}
