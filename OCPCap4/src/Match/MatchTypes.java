package Match;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

/*allMatch()
 *anyMatch()
 *noneMatch()
 * 
 * 
 * Reduction representa que ve a todos los elementos de un stream
 * 
 * 
 * firma:
 * boolan anyMatch(Predicate<? super T> predicate)			... aplica para allMatch y noneMatch
 * */


public class MatchTypes {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("monkey","2","chimp");
		Stream<String> infinite = Stream.generate(()->"chimp");
		Predicate<String> pred = x -> Character.isLetter(x.charAt(0));				/*INTERESANTE --> Character.isLetter*/
		System.out.println(list.stream().anyMatch(pred));							/*true -> Two out of three match*/
		System.out.println(list.stream().allMatch(pred));							/*false -> "TODOS HACE MATCH" No todos hacen match*/
		System.out.println(list.stream().noneMatch(pred));							/*false -> "NINGUNO HACE MATCH" */
		System.out.println(infinite.anyMatch(pred));								
		
		
		/*los match regresan un booleano
		 * los metodos find regresan un Optional, pues regresan un elemento del stream*/

	}

}
