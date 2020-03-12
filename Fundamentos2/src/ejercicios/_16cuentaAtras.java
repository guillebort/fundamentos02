package ejercicios;

import java.util.Scanner;

public class _16cuentaAtras {
	public static void main(String[] args) {
		Scanner tec = new Scanner (System.in);
		
		System.out.println("Introduce un numero: ");
		int n = tec.nextInt();
		
		while(n>0){
			System.out.println(n);
			n = n - 1;
		}
	}

}
