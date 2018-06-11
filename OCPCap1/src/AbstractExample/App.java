package AbstractExample;

public class App {

	public static void main(String[] args) {
		Lion leon = new Lion();
		leon.clean();
		leon.clean2();
		
		/*No importa que la clase apunte a Cat, el metodo sobreescrito siempre será llamado*/
		Cat leon2 = new Lion();
		leon.clean2();

	}

}
