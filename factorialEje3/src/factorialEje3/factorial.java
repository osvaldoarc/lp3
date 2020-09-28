package factorialEje3;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
	  System.out.print("Ingresar Número: ");
	  int num = sc.nextInt();
	  
	  System.out.printf("El factorial de %d es %.0f\n",num, factorial(num));
	}
	public static double factorial(int n) {
		double aux = 1;
		for(int i = 2; i <= n; i++){
			aux *= i;			
		}
		return aux;
		
	}
}
