package Optional;

import java.util.Optional;

/*Un optional sería como encapsular un objeto en donde el objeto puede contener algo o estar vacío*/
public class AverageOptional {
	public static void main(String... args){
		System.out.println(average(90,100));
		System.out.println(average());
		
		/*Para revisar si el objeto Optional tiene objeto, sería*/
		Optional<Double> opt = average(90,100);
		if(opt.isPresent())
			System.out.println(opt.get());
		
		
		String value = "test";
		/*Si un valor es nulo se podría regresar un Optional.empty, de lo contrario se haria un wrapper de Optional con Optional.of(valor)*/
		Optional o = Optional.ofNullable(value);				/*Es sinonimo de Optional o = (value == null) ? Optional.empty() : Optional.of(value);*/
	}
	public static Optional<Double> average(int... scores){
		if(scores.length == 0) return Optional.empty();
		int sum = 0;
		for(int score: scores) sum+=score;
		return Optional.of((double) sum/scores.length);			/*Aqui se encapsula el promedio en un Optional*/
		
		/*Ver los codigos de la pagina 183 y 184, orElse, orElseTrhow*/
	}

}
