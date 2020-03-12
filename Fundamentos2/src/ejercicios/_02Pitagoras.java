package ejercicios;

import java.util.Scanner;

public class _02Pitagoras {
	public static void main(String[] args) {
		Scanner tec = new Scanner (System.in);
		
		System.out.println("Introduce el valor de los catetos: ");
		double cateto = tec.nextDouble();
		double catetos = cateto + cateto;
		
		double hipotenusa = Math.pow(catetos, 2) + cateto + cateto;
		System.out.println("Hipotenusa: " + hipotenusa);
	}

}
