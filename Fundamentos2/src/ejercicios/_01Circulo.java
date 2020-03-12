package ejercicios;

import java.util.Scanner;

public class _01Circulo {
	public static void main(String[] args) {
		Scanner tec = new Scanner (System.in);
		
		System.out.println("Introduce el radio del circulo: ");
		double radio = tec.nextDouble();
		double longitud = 2*Math.PI*radio;
		
		System.out.println("La longitud es: " +  longitud );
		
		double area = Math.PI*Math.pow(radio, 2);
		System.out.println("El area es : " + area);
	}

}
