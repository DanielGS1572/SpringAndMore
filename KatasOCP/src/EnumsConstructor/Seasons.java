package EnumsConstructor;

public enum Seasons {
	
	WINTER("A"),SPRING("B"),FALL("C");
	private String clasification;
	
	private Seasons(String clasification) {
		this.clasification = clasification;
	}

	public String getClasification() {
		return clasification;
	}

	public void setClasification(String clasification) {
		this.clasification = clasification;
	}
	
	
}
