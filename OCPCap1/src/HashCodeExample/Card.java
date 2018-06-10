package HashCodeExample;


/*El hashcode se usa para apilar elementos de una lista llave-valor y cuando se sobreescribe debe ser un valor
 * que no tenga valores variables, es decir el valor de hashcode que retorne no debe cambiar con el tiempo
 * 
 * Se usa para apilar elementos (categorizarlos) para que cuando se haga algun tipo de busqueda retorne 
 * valores mucho mas rapido
 * 
 * Sobreescribir el hashcode no puede usar mas variables que cuando se sobreescribe el equals*/
public class Card {
	public String suit;
	public String rank;
	
	public Card(){
		
	}
	public Card(String s, String r) {
		if(s == null || r == null)
			throw new IllegalStateException();
		suit = s;
		rank = r;
	}
	public boolean equals(Object obj) {
		if( !(obj instanceof Card)) return false;
		Card card = (Card) obj;
		return suit.equals(card.suit) && rank.equals(card.rank);
	}
	public int hashCode() {
		return rank.hashCode();
	}
	public String getSuit() {
		return suit;
	}
	public void setSuit(String suit) {
		this.suit = suit;
	}
	public String getRank() {
		return rank;
	}
	public void setRank(String rank) {
		this.rank = rank;
	}

}
