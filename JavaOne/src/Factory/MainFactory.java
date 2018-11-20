package Factory;

import java.awt.Color;
import java.util.List;

public class MainFactory {

	public static void main(String[] args) {
		Factory<Circle> circle = Circle::new;
		Circle circulo = circle.get();
		
		List<Circle> listCircle = circle.get(3);
		listCircle.forEach(System.out::println);
		
		//Los metod references puede comportarse como Suppliers o como Functions, por ejemplos
		Factory<Circle> redCircleFactory1 = () -> new Circle(Color.RED);
		Factory<Circle> redCircleFactory2 = Factory.create(Circle::new, Color.green);		
		//Circle::new es un MR de tipo Function y todo lo obtiene
		//del contexto

		List<Circle> fiveRedCircles = redCircleFactory2.get(5);
		fiveRedCircles.forEach(e -> System.out.println(e.getColor()));

	}

}
