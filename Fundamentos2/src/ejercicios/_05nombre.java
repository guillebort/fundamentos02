package ejercicios;

import java.util.Scanner;

public class _05nombre {
	public static void main(String[] args) {
		Scanner tec = new Scanner (System.in);
		
		System.out.println("Introduce tu nombre: ");
		String nombre = tec.nextLine();
		
		
		String primLetra = nombre.substring(0, 1);
		
		String ultLetra = nombre.substring(8);
		
		if(primLetra.equals(ultLetra)){
			System.out.println("primera letra y ultima coinciden");
		}else{
			System.out.println("primera y ultima letra no coinciden");
		}
		System.out.println(nombre + " primera letra: " + primLetra + " ultima letra: " + ultLetra);
	}

}
