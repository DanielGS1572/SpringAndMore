package SearchingAndSorting;

import java.util.*;

/*El metodo sort usa compareTo() para ordenar (POR LO QUE EL OBJETO DEBE IMPLEMENTAR LA INTERFAZ COMPARABLE), O EN SU DEFECTO PASARLE UN COMPARATOR*/
public class SortingMethod{
	static class Rabbit implements Comparable{int id;
		public Rabbit(int id) {
			this.id = id;
		}
		public String toString() {
			return this.id+"";
		}
		@Override
		public int compareTo(Object o) {
			// TODO Auto-generated method stub
			return this.id - ((Rabbit)o).id;
		}
	}
	public static void main(String[] args) {
		List<Rabbit> rabbits = new ArrayList<>();
		rabbits.add(new Rabbit(1));
		rabbits.add(new Rabbit(10));
		rabbits.add(new Rabbit(3));
		System.out.println(rabbits);
		System.out.println("");
		Comparator<Rabbit> c = (rab1,rab2) -> rab1.id - rab2.id;   /*ORDEN ASCENDENTE*/
		Collections.sort(rabbits, c);
		System.out.println(rabbits);
		
		Comparator<Rabbit> reverse = Collections.reverseOrder();		/*Para que funcione el reverse order se debe implementar Comparable en el objeto
		pues para que pueda ordenarlo internamente debe sobreescribir compareTo*/
		
		/*Tambien se le puede pasar la interfaz de reverse order para que sepa como ordenar*/
//		Comparator<Rabbit> reverse2 = Collections.reverseOrder(c);
		Collections.sort(rabbits,reverse);
		System.out.println();
		System.out.println(rabbits);
		
		/*En un Set, se le puede especificar directamente el tipo de Comparator a usar, por ejempo*/
		Set<Rabbit> rabbit = new TreeSet<>(new Comparator<Rabbit>() {

			@Override
			public int compare(Rabbit o1, Rabbit o2) {
				// TODO Auto-generated method stub
				return o1.id - o2.id;
			}
			
		});

	}
	
}
