package InterfaceBasics1;

public class app {

	public static void main(String[] args) {
		Eagle eagle = new Eagle();
		try {
			eagle.getWingSpan();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		eagle.land();
		int var = Eagle.MAX_SPEED;
		var = 8;		/*A pesar de ser static y final, se puede modificar*/
		System.out.println(var);
		
		
		int var2 = Fly.MAX_SPEED;
		Fly.calculateSpeed(5, 6);
		
	}

}
