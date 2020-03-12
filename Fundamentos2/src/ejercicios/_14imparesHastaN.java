package ejercicios;

import java.util.Scanner;

public class _14imparesHastaN {
	public static void main(String[] args) {
		Scanner tec = new Scanner (System.in);
		
		System.out.println("Intoduce un numero: ");
		int n = tec.nextInt();
		int pares = 2;
		
		while(pares< n){
			System.out.println( pares + " es multiplo de " + n);
			pares = pares+2;
		}
	}

}
