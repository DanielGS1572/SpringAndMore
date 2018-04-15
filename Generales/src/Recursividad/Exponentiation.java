package Recursividad;

public class Exponentiation {
	public static void main(String args[]){
		System.out.println("5^2 " + exponentiation(5, 2));
	}
	public static int exponentiation(int n, int p){
		if(p <= 0){
			return 1;
		}else{
			return n*exponentiation(n,p-1);
		}
	}
}
