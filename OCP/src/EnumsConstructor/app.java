package EnumsConstructor;

public class app {

	public static void main(String[] args) {
		Season.WINTER.setExpectedVisitors("aaa");
		System.out.println(Season.WINTER.getExpectedVisitors());

	}

}
