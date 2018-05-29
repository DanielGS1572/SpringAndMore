package GenericClasses;


/* La nomenclatura para genericos es la siguiente
 * E.- para elementos
 * K.- para elementos key de un map
 * V.- para elementos value de un map
 * N.- para numeros
 * T.- para datos de tipo generico
 * S,U,V.- para todo lo demas
 * */

/*Los genericos se usarn regularmente cuando se quiere trabajar con objetos que no tienen absolutamente ninguna
 * relación entre sí, dentro de una jaula, puede ir un elefante, una zebra, un robot etc. sin tener la 
 * necesidad de tener una interfaz que los conecte de alguna manera*/

/*El unico tema con los genericos es que java hace un casteo por nosotros, dependiendo de lo que este 
 * dentro del operador diamante, en dado que este mal por ejemplo una iteracion, el error lo mandaría
 * @compileTime en lugar de lanzar un classCastException @runtime
 *				List<dragons> listaDragones= new ArrayList<>();
 *				for(Sheep dragon: listaDragones) manda un error en compile time
 *
 *				Si se usará				
 *				List listaDragones= new ArrayList();		--> Raw List (no tiene operador diamante)
 *				for(Sheep dragon: listaDragones) manda un error ClassCastException en run time (y simplemente envia
 *															un warning en el codigo)
 *
 *	Tener cuidado con metodos que reciban listas pues sería el mismo problema que el anterior descritos con 
 *	lo siguiente:
 *		private void recibeLista(List lista);
 *		private void recibeLista(List<Dragon> lista);
 * 
 * */
public class Crate<T> {
	private T contents;
	public T emptyCrate(){
		return contents;
	}
	
	public void packCrate(T contents){
		this.contents = contents;
	}
}
