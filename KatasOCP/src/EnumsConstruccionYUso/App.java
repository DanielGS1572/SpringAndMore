package EnumsConstruccionYUso;

public class App {
	public static void main(String args[]) {
		Season s1 = Season.WINTER;
		System.out.println(s1.name() + " - " + s1.ordinal());
		System.out.println(Season.valueOf("SPRING"));
		
		switch(s1) {
		case FALL: System.out.println("fall"); break;
		case WINTER: System.out.println("winter"); break;
		case SPRING: System.out.println("spring"); break;
		default: System.out.println("none");
		}
	}

}
