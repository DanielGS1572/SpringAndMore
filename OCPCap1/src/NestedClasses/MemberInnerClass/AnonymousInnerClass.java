package NestedClasses.MemberInnerClass;
//Una clase anonima interna es una local inner class pero sin nombre
//Es declarada e instanciada por el uso de la palabra new				(?)

//Solo sirve cuando se extiende o se implementa una interfaz,
//es decir en lugar de hacer ClaseAnonima extends ClaseAbstracta, simplemente
//se hace un new ClaseAbstracta(), por eso se dice que la ClaseAnonima no lleva nombre
//pues simplemente se hace un new ClaseAbstracta()		--> SIMPLEMENTE SE SOBRE ESCRIBE LA INTERFAZ

//Con la interfaces es un caso curioso pues no se pueden instanciar con new
//En las clases anonimas si pues con el new se esta diciendo ClaseAnonima implements Interfaz
public class AnonymousInnerClass {/*UNA CLASE DENTRO DE UNA CLASE*/
		/*abstract*/ class SaleTodayOnly {		//Tampoco es necesario que sea 
//											abstracta pues se puede hacer override al 
//											metodo
//			abstract int dollarsOff();
			 
				 int dollarsOff(){return 1;};
			
		}
		
		public int admission(int basePrice) {
			SaleTodayOnly sale = new SaleTodayOnly() {
				int dollarsOff() {
					return 3;
				}
			};				//como sale se esta asignando a algo... aqui debe llevar ;
			return basePrice - sale.dollarsOff();
		}
//		La forma corta de escribir clases anonimas es con "Functional Programming"
		public static void main(String args []) {
			AnonymousInnerClass aIC = new AnonymousInnerClass();
			System.out.println(aIC.admission(8));
		}
}
