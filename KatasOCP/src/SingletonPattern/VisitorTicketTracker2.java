package SingletonPattern;

public class VisitorTicketTracker2 {
		private static VisitorTicketTracker2 instance;
		private VisitorTicketTracker2(){
			
		}
		public VisitorTicketTracker2 getInstance(){
			if(instance == null){
				synchronized(VisitorTicketTracker2.class){
					
					instance = new VisitorTicketTracker2();
				}
			}
			return instance;
		}
}
