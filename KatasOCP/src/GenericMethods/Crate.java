package GenericMethods;

public class Crate<T> {
	public static <T> Crate<T> method1(T t){
		return new Crate<T>();
	}
	public static <T> void method2(T t){
		
	}
	public static <T> T method3(T t){
		return t;
	}
}
