package SingletonPattern;

public class VisitorTicketTracker2 {
	private static volatile VisitorTicketTracker2 instance;
/*volatile significa que intenta acceder a la instancia antes de ser creada*/
	private VisitorTicketTracker2() {
	}

	private static VisitorTicketTracker2 getInstance() {
		if (instance == null) {
			synchronized (VisitorTicketTracker2.class) {	/*Como es el patron de singleton
la sincronizacion solo se necesita cuando serà creado por primera vez, no siempre que se 
mande llamar el metodo como en el caso de la clase anterior (VisistorTicketTracker)*/

				instance = new VisitorTicketTracker2();
				
			}
		}
		return instance;
	}
}
