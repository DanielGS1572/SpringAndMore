package EnumsMetodosAbstractos;

import static EnumsMetodosAbstractos.Seasons.*;
public class app {

	public static void main(String[] args) {
			WINTER.getNumber();
			System.out.println(Seasons.WINTER.getHello());
			AUTUMN.getCha();		/*Porque no se puede obtener getChaCha del enum?*/
			
			

	}

}
