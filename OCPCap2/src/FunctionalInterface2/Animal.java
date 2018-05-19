package FunctionalInterface2;

public class Animal {
	private String species;
	private boolean hop;
	private boolean swim;
	
	public Animal(String species, boolean hop, boolean swim){
		this.species = species;
		this.hop = hop;
		this.swim = swim;
	}

	public String getSpecies() {
		return species;
	}

	public boolean isHop() {
		return hop;
	}
	public boolean isSwim() {
		return swim;
	}
	
}
