package ChainingOptional;

import java.util.Optional;

public class ThreeDigit {
	
	/*FUNCTIONAL*/
	private static void threeDigitOne(Optional<Integer> optional) {
		if(optional.isPresent()) {								/*Si un optional viene vacio ya no hace nada*/
			Integer num = optional.get();
			String string = "" + num;							/*para ver que un numero este compuesto por 3 digitos se convierte a string y se ve el length*/
			if(string.length() == 3) {
				System.out.println(string);
			}
		}
	}
	/*NON - FUNCTIONAL*/
	private static void threeDigitTwo(Optional<Integer> optional) {
		optional.map(n -> "" + n).filter(s -> s.length() == 3).ifPresent(System.out::println);			/*Pasa por los dos primeros filtros si un Optional viene incluso vacio*/
	}

	public static void main(String[] args) {
		Optional op = Optional.of(433);
		threeDigitOne(op);
		threeDigitTwo(op);
	}

}
