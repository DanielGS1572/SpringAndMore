package InterfaceBasics1;

public interface Fly {
	public int getWingSpan() throws Exception;
	public static final int MAX_SPEED = 100;
	
	public default String getString() {
		return "String";
	}
	
	public static float getMaxSpeed(int a, int b) {
		return a/b;
	}
}
