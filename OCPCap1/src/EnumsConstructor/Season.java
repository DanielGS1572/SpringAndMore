package EnumsConstructor;

public enum Season {
	WINTER("LOW"),SPRING("MEDIUM"),SUMMER("LITTLE"),FALL("NONE");
	private String expectedVisitors;
	
	/*El constructor en los enums solo pueden ser privados, pues no pueden ser modificados por fuera,
	 * la definición del enum solo queda contenida dentro del propio enum, es decir no es posible (ni tiene caso)
	 * que se modifique por fuera (a traves del constructor, si se puede a traves de un setter, pero no tiene caso*/
	private Season(String visitors) {
		expectedVisitors = visitors;
	}
	
	public String getExpectedVisitors() {
		return expectedVisitors;
	}

	
	
}
