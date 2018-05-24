package SingletonPattern;
/*Otra forma de hacer el patron de diseño singleton se llama
 * lazy initialization, y se le llama lazy porque solo se hara la instancia una vez
 * que se mande llamar getInstance, no cuando se cargue la clase en memoria (al 
 * tener las variables marcadas como static, por eso las carga al principio)*/
public class VisistorTicketTracker {
	private static VisistorTicketTracker instance;
	private VisistorTicketTracker(){}
	
	private static /*synchronized*/ VisistorTicketTracker getInstance(){
		if(instance == null)
			instance = new VisistorTicketTracker();		//Not thread safe!!! Para hacerlo safe thread despues del
//			static se agrega la palabra synchronized, de esta manera se asegura que no se cree más de un objeto
		return instance;
	}
}
