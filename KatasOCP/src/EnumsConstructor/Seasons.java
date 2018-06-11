package EnumsConstructor;

public enum Seasons {
	WINTER("a"), AUTUMN("b"), FALL("c");
	private String calificacion;
	
	private Seasons(String calificacion){
		this.calificacion = calificacion;
	}
	
	public String getCalificacion(){
		return calificacion;
	}
	
}
