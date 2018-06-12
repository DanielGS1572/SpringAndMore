package HashCodeExample;
/*El hashcode se usa para apilar elementos de una lista llave-valor y cuando se sobreescribe debe ser un valor
 * que no tenga valores variables, es decir el valor de hashcode que retorne no debe cambiar con el tiempo
 * 
 * Se usa para apilar elementos (categorizarlos) para que cuando se haga algun tipo de busqueda retorne 
 * valores mucho mas rapido
 * 
 * Sobreescribir el hashcode no puede usar mas variables que cuando se sobreescribe el equals*/
public class Card {
	private String rank;
	private String suit;
	public Card(){
		
	}
	public Card(String rank, String suit){
		if(rank == null || suit == null)
			throw new IllegalStateException();
		this.rank = rank;
		this.suit = suit;
	}
	

	public boolean equals(Object obj){
		if(!(obj instanceof Card)) return false;
		Card card = (Card) obj;
		return this.rank.equals(card.rank) && this.suit.equals(card.suit);
		
	}
	
	public int hashCode(){
		return suit.hashCode() + 17*31 + rank.hashCode();
	}

	public String getRank() {
		return rank;
	}
	public void setRank(String rank) {
		this.rank = rank;
	}
	public String getSuit() {
		return suit;
	}
	public void setSuit(String suit) {
		this.suit = suit;
	}
	public String toString(){
		return this.rank + " " + this.suit;
	}
}
