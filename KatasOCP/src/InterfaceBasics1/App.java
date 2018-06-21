package InterfaceBasics1;

public class App {

	public static void main(String[] args) {
		Eagle eagle = new Eagle();
		
		System.out.println(Eagle.maxSpeed);
		try {
			System.out.println(eagle.getWingType());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		eagle.getLandingType();
		System.out.println(Fly.getAverageSpeed(10, 3));
	}

}
