package NestedClasses.MemberInnerClass;

public class AnonymousInnerClassWithInterface {
	public int admission(int basePrice) {
		SalesTodayOnly sale = new SalesTodayOnly() {		/*Es como si se hiciera un implements
		a una clase pero simplemente queda dentro del metodo la implementación sin que nadie 
		 más pueda acceder a ella, se podría poner a nivel de la clase y sobre-escribir el metodo
		 pero quedaría disponible cada que se instancie la clase AnonymousInnerClassWithInterface */
			public int dollarsOff() {		//Las interfaces requieren modificadores de acceso tipo
//											public cada que se implemente (pues es el default en cada interfaz y no se puede restringir
				return 3;
			}
		};
		return basePrice - sale.dollarsOff();
	}
	
	public static void main(String args[]) {
		AnonymousInnerClassWithInterface x = new AnonymousInnerClassWithInterface();
		System.out.println(x.admission(10));
	}
}
