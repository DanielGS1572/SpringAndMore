package SingletonPattern;
/*Otra forma de hacer el patron de dise�o singleton se llama
 * lazy initialization, y se le llama lazy porque solo se hara la instancia una vez
 * que se mande llamar getInstance, no cuando se cargue la clase en memoria (al 
 * tener las variables marcadas como static, por eso las carga al principio)*/
public class Synch {
	private Synch instance;
	private Synch(){}
	
	public synchronized Synch getInstance() {
		if(instance == null) {
			instance = new Synch();
		}
		return instance;
	}
}
