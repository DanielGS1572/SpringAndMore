package NestedClasses.MemberInnerClass;

public class AnonymousInnerClassWithInterface {
	public int admission(int basePrice) {
		SalesTodayOnly sale = new SalesTodayOnly() {		/*Es como si se hiciera un implements
		a una clase pero simplemente queda dentro del metodo la implementaci�n sin que nadie 
		 m�s pueda acceder a ella, se podr�a poner a nivel de la clase y sobre-escribir el metodo
		 pero quedar�a disponible cada que se instancie la clase AnonymousInnerClassWithInterface */
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
