package FunctionalInterface1;

@FunctionalInterface
public interface Run extends Sprint{
//	public void test();		Esta instrucci�n ya mandar�a error pues ya es esta implementando
//	un metodo abstracto
	public String toString();			/*Incluso acepta los metodos de Object*/
	public boolean equals(Object o);
}
