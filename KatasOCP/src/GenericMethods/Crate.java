package GenericMethods;

public class Crate<T> {
	public static <T> T getCrate(T t) {
		return t;
	}
	
	public static <T> int returnInt() {
		return 10;
	}
	
	public static <T> Crate<T> getObject()
	{
		return new Crate<T>();
	}
}
