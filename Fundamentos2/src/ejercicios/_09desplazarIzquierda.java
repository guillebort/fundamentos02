package ejercicios;

import java.util.Scanner;

public class _09desplazarIzquierda {
	public static void main(String[] args) {
		Scanner tec = new Scanner (System.in);
		
		System.out.println("Introduce una palabra: ");
		String palabra = tec.next();
		
		String primLetra = palabra.substring(0, 1);
		String elimLetra = palabra.replace(primLetra, "");
		
		System.out.println(elimLetra + primLetra );
	}

}
