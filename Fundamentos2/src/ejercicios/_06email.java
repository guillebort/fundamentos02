package ejercicios;

import java.util.Scanner;

public class _06email {
	public static void main(String[] args) {
		Scanner tec = new Scanner (System.in);
		
		System.out.println("Introduce tu correo electronico: ");
		String correo = tec.nextLine();
		
		int posArroba = correo.indexOf('@');
		int posPunto = correo.indexOf('.');
		
		String nombre = correo.substring(0, posArroba);
		String subdominio = correo.substring(posArroba +1, posPunto);
		String dominio = correo.substring(posPunto +1);
		
		System.out.println("nombre: " + nombre + " subdominio: " + subdominio + " dominio: " + dominio);
	}

}
