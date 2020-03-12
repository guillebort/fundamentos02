package ejercicios;

import java.util.Scanner;

public class _08partir {
	public static void main(String[] args) {
		Scanner tec = new Scanner (System.in);
		
		System.out.println("Introduce un texto ");
		String texto = tec.nextLine();
		
		System.out.println("Elige una posicion");
		int posicion = tec.nextInt();
		
		int posEspacio = texto.indexOf(' ');
		
		if (posicion == posEspacio){
			
			
			
			String primParte = texto.substring(0, posEspacio);
			String segParte = texto.substring(posEspacio +1);
			
			System.out.println("primera parte: " + primParte + " segunda parte: " + segParte);
			
		}else{
			System.out.println("no se puede partir");
		}
	}

}
