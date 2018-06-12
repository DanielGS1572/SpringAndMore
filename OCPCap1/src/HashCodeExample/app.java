package HashCodeExample;

import java.util.HashSet;
import java.util.Set;

public class app {

	public static void main(String[] args) {
		Card ref = new Card("Rank1","Suit1");
		Card card1 = new Card("Rank2","SuitA");
		Card card2 = new Card("Rank3","SuitB");
		Card card3 = new Card("Rank4","SuitC");
		Card card4 = new Card("Rank1","Suit1");
		Card card5 = new Card("Rank6","SuitD");
		Card card6 = new Card("Rank7","SuitE");
		Card card7 = new Card();		/*Se debe de agregar al Set con Setters si no no lo agrega, ve que es un mismo objeto que card4*/
		card7.setRank("Rank1");
		card7.setOther("Suit1");
		
		HashSet<Card> hashSet = new HashSet<>();
		hashSet.add(card1);
		hashSet.add(card2);
		hashSet.add(card3);
		hashSet.add(card4);
		hashSet.add(card5);
		hashSet.add(card6);
		hashSet.add(card7);
	
		for(Card card:hashSet){			
			System.out.println(card.equals(ref) + " -- " + card.toString() + " card.hashSet() " + card.hashCode() +
					" Suit.hashSet " + ref.hashCode());
		}

	}

}
