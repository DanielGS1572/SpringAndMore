package HashCodeExample;

import java.util.ArrayList;
import java.util.List;

public class app {

	public static void main(String[] args) {
		Card referencia = new Card(1,"CartaRef");
		Card carta1 = new Card(1,"Carta1");
		Card carta2 = new Card(2,"Carta2");
		Card carta3 = new Card(3,"Carta3");
		Card carta4 = new Card(4,"Carta4");
		
		List<Card> lista = new ArrayList<>();
		lista.add(carta1);
		lista.add(carta2);
		lista.add(carta3);
		lista.add(carta4);
		
		for(Card obj: lista){
			System.out.println(obj.equals(referencia) + " " +  obj.getRank());
		}

	}

}
