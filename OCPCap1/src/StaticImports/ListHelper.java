package StaticImports;

import java.util.ArrayList;
import java.util.List;
import static java.util.Collections.*;	/*un static import es para usar metodos estaticos sin tener que llamar la clase*/
import static java.util.Collections.sort;		/*Tambien se puede llegar a especificar el metodo pero sin parentesis*/
import static java.lang.Math.*;					/*También aplica para constantes*/

public class ListHelper {
	
	public List<String> copyAndSort(List<String> listaOriginal){
		List<String> listaSecundaria = new ArrayList(listaOriginal);
		sort(listaSecundaria);
		System.out.println(PI);
		return listaSecundaria;
	}

}
