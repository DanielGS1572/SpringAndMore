package GenericInterfaces;


/*Una de las formas de implementar la interfaz es explicitamente diciendole
 * el tipo de objeto que recibir� la interfaz Generica*/
public class ShippableZebraCrate implements Shippable<Zebra> {
	/*	ShippableRobotCrate sRC = new ShippableRobotCrate();		--> no se usa el operador diamante 
		sRC.shipt(z);*/

	@Override
	public void ship(Zebra t) {
			
	}
	
}
