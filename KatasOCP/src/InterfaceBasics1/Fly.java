package InterfaceBasics1;

public interface Fly {
	public static final int maxSpeed = 100;
	public int getWingType() throws Exception;
	
	public default void getLandingType(){
		System.out.println("landing");
	}
	
	public static float getAverageSpeed(int a, int b){
		return a/b;
	}
	
}
