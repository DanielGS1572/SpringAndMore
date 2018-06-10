package HashCodeExample;

import java.util.HashSet;
import java.util.Set;

public class app {

	public static void main(String[] args) {
		Card reference= new Card("a","1");
		Card card1 = new Card("a","1");
		Card card2 = new Card("b","2");
		Card card3 = new Card("c","3");
		Card card4 = new Card("d","4");
		Card card5 = new Card();
		card5.rank = "a";
		card5.suit = "1";
		
		Set<Card> set = new HashSet<Card>();
		set.add(card1);
		set.add(card2);
		set.add(card3);
		set.add(card4);
		set.add(card5);
		
		for(Card card:set){
			System.out.println(card.equals(reference));
		}
		

	}

}
