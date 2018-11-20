package Lambdas;

public class ConsumerExample {

	public static void main(String[] args) {
		MyConsumer<String> eating = s -> System.out.println("Eating " + s);
		eating.accept("Chicken");
		
		MyConsumer<String> drinking = s -> System.out.println("Drinking " + s);
		eating.accept("Coffee");
		
		MyConsumer<String> eatingAndDrinking = eating.andThen(drinking);
		eatingAndDrinking.accept("Good food");
		

	}

}
