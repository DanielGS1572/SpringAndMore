package Lambdas;

public class PredicateExample {

	public static void main(String[] args) {
		MyPredicate<String> notNull = s -> s != null;
		MyPredicate<String> shorterThan10 = s -> s.length() > 10;
		
		MyPredicate<String> p1 = notNull.andThen(shorterThan10);
		System.out.println("testing null " + p1.test("abc"));

		
		System.out.println(shorterThan10.negate().test("abc"));			//Lo que sea que de el resultado lo negara antes
	}

}
