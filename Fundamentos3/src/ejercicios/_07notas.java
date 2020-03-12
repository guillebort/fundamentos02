package ejercicios;

import java.util.Scanner;

public class _07notas {
	public static void main(String[] args) {
		Scanner tec = new Scanner (System.in);

		System.out.println("Introduce el numero de notas");
		
		int notas= 0;
		do{
			notas = tec.nextInt();
			if(notas >= 5){
				System.out.println("aprobado");
				
			}else{
				if(notas < 5){
					System.out.println("suspendido");
				}else if (notas > 0){
					System.out.println("");
					
				}
			}
		}while(notas > -1);
		System.out.println("Fin del programa");
	}
}
