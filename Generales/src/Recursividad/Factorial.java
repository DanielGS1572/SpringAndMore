package Recursividad;

public class Factorial {
	public static void main(String args[]){
		System.out.println("Factorial: " + calculaFactorial(6));
	}
	
	public static int calculaFactorial(int n){
		if(n <= 1){
			return 1;
		}else{
			return n*calculaFactorial(n-1);
		}
		
	}
}
