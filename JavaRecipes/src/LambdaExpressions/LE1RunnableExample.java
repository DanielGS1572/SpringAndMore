package LambdaExpressions;

public class LE1RunnableExample {

	public static void main(String[] args) {



		new Thread(new Runnable() {					/*La clase Thread solo acepta una interfaz, en este caso se hace un Anonymous inner Class*/

			@Override
			public void run() {
				System.out.println("xxx");

			}
		}).start();

		/*Runnable es una interfaz funcional (solo tiene un metodo que es run()), por lo que se puede aplicarle una expresión lambda*/
		/*LAS EXPRESIONES LAMBDA SOOOOLO SE PUEDEN ASIGNAR A INTERFACES FUNCIONALES*/




		/*Lo que importa es el tipo de retorno, como la interfaz funcional tiene un metodo que regresa void, y el System.out.println tambien regresa void
		 * una expresión lambda puede ser asignada a la interfaz Runnable (también importa los argumentos que reciba), por ejemplo:*/
		Runnable r = () -> System.out.println("xxx");				/*Ver como una expresion lambda es la definicion del cuerpo de una interfaz funcional,
		por eso la importancia de tener un solo metodo, ya que al implementarla se le dice en específico que se define ese unico metodo. Siendo así, el nombre
		del metodo pierde relevancia, ver que no aparece run() en la sintaxis del lambda*/
		new Thread(r).start();;

	}

}
