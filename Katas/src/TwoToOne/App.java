package TwoToOne;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//Se le pasa dos cadenas en las que unidas se deben de eliminar duplicados y ordenar alfabeticamente

public class App {
		public static void main(String args[]) {
			System.out.println(longest2("dzzzgabccce","dgabcccrfrfre"));
		}
		
		public static String longest1(String s1, String s2) {
			Set<Character> eliminaRepetidos1 = new HashSet();
			char[] char1 = s1.toCharArray();
			char[] char2 = s2.toCharArray();
			for(char c1 : char1) {
				eliminaRepetidos1.add(c1);
			}
			for(char c2 : char2) {
				eliminaRepetidos1.add(c2);
			}
			List<Character> ordenaLista = new ArrayList(eliminaRepetidos1);
			char[] charArray = new char[ordenaLista.size()];
			for(int i = 0; i<ordenaLista.size(); i++) {
				charArray[i]=ordenaLista.get(i);
			}
			Arrays.sort(charArray);
			String resultado = "";
			for(char n : charArray) {
				resultado += n;
			}
			return resultado;
		}
		public static String longest2(String s1, String s2) {
			String all = "abcdefghijklmnopqrstuvwxyz";
	        return all.replaceAll("[^" + s1+s2 + "]", "");
		}
	
}
