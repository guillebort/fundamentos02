package ejercicios;

import java.util.Scanner;

public class _04Redondear {
	public static void main(String[] args) {
		Scanner tec = new Scanner (System.in);
		
		System.out.println("Introduce un numero entero:");
		double numero = tec.nextDouble();
		System.out.println("Numero redondeado es: " + Math.round(numero));
		
		
		
	}

}
