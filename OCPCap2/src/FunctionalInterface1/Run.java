package FunctionalInterface1;

@FunctionalInterface
public interface Run extends Sprint{		/*Ya no acepta otro metodo pues ya tiene uno abstracto porque extiende otra interfaz*/
//	public void test();		Esta instrucci�n ya mandar�a error pues ya es esta implementando
//	un metodo abstracto la anotacion evita que se metan mas metodos
	public String toString();			/*Incluso acepta los metodos de Object*/
	public boolean equals(Object o);
	
}
