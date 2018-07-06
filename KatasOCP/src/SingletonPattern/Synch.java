package SingletonPattern;
/*Otra forma de hacer el patron de dise�o singleton se llama
 * lazy initialization, y se le llama lazy porque solo se hara la instancia una vez
 * que se mande llamar getInstance, no cuando se cargue la clase en memoria (al 
 * tener las variables marcadas como static, por eso las carga al principio)*/
public class Synch {
	private static Synch instance;
	private Synch(){}
	
	private static synchronized Synch getInstance(){
		if(instance == null)
			instance = new Synch();		//Not thread safe!!! Para hacerlo safe thread despues del
//			static se agrega la palabra synchronized, de esta manera se asegura que no se cree m�s de un objeto
		return instance;
	}
}
