package EnumsConstructor;

public enum Seasons {
	WINTER("A"),FALL("B"),AUTUMN("C"),X("D");
	private String clasificacion;
	private Seasons(String clasificacion){
		this.clasificacion = clasificacion;
	}
	public String getClasificacion() {
		return clasificacion;
	}
	
	
}
