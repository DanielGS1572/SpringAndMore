package HashCodeExample;

public class Card {
	private String rank;
	private String other;
	public Card(){
		
	}
	public Card(String rank, String other){
		if(rank == null || other == null)
			throw new IllegalStateException();
		this.rank = rank;
		this.other = other;
	}
	

	public boolean equals(Object obj){
		if(!(obj instanceof Card)) return false;
		Card card = (Card) obj;
		return this.rank.equals(card.rank) && this.other.equals(card.other);
		
	}
	
	public int hashCode(){
		return other.hashCode();
	}

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

	public String getOther() {
		return other;
	}

	public void setOther(String other) {
		this.other = other;
	}
	
	public String toString(){
		return this.rank + " " + this.other;
	}
}
