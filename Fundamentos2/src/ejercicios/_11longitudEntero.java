package ejercicios;

import java.util.Scanner;

public class _11longitudEntero {
	public static void main(String[] args) {
		Scanner tec = new Scanner (System.in);
		
		System.out.println("Introduce un entero largo: ");
		long entero = tec.nextLong();
		
		String numero = String.valueOf(entero); 
		
		
		System.out.println("Longitud: " + numero.length());

	}

}
