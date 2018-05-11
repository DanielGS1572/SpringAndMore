package AbstractExample;

abstract public class Cat {
	/*La clase puede no tener ningun metodo (estar completamente vacia)*/
	abstract void clean();		/*Necesita la palabra abstract pues ya se puede tener una implementación de un metodo*/
	
	
	void clean2() {				/*--> implementación por default, que puede ser overriden*/
		System.out.println("clean2() original");
	}
}
