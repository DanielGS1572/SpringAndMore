package AbstractExample;

public class App {

	public static void main(String[] args) {
		Lion leon = new Lion();
		leon.clean();
		leon.clean2();
		
		/*No importa que la clase apunte a Cat, el metodo sobreescrito siempre ser� llamado, ese es el chiste del polimorfismo*/
		Cat leon2 = new Lion();
		leon2.clean2();

	}

}
