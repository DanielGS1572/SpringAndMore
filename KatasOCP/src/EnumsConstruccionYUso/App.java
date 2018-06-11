package EnumsConstruccionYUso;

public class App {
	public static void main(String args[]) {
		System.out.println(Season.WINTER.name() + " " + Season.WINTER.ordinal());
		
		Season temporada = Season.valueOf("FALL");
		
		switch(temporada){
		case WINTER: System.out.println("winter");
		break;
		case SPRING: System.out.println("spring");
		break;
		case FALL: System.out.println("fall");	
		break;
		default: System.out.println("default");
		
		}
	}

}
