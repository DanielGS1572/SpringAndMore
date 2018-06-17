package HashCodeExample;

public class Card {
	private Integer rank;
	private String suit;
	
	public Card(int rank, String suit){
		this.rank = rank;
		this.suit = suit;
	}
	public boolean equals(Object obj){
		return ((Card)obj).getRank() == this.getRank();
	}
	
//	public int hashCode(){
//		return this.getRank().hashCode() ;
//	}
	public Integer getRank() {
		return rank;
	}
	public void setRank(Integer rank) {
		this.rank = rank;
	}
	public String getSuit() {
		return suit;
	}
	public void setSuit(String suit) {
		this.suit = suit;
	}
	
	
	
	
	
}
