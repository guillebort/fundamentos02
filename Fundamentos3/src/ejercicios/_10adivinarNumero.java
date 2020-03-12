package ejercicios;

import java.util.Scanner;

public class _10adivinarNumero {
	public static void main(String[] args) {
		Scanner tec = new Scanner (System.in);
		
		
		System.out.print("Numero a adivinar: ");
		int numAleatorio = (int) (Math.random()* 100);
		System.out.println(numAleatorio);
		
		int num;
		do{
			System.out.println("Adivina el numero");
			num = tec.nextInt();
			 
			if(numAleatorio == num){
				System.out.println("Has acertado");
				
			}else if(numAleatorio < num){
				System.out.println("Te has pasado");
				
			}else if(numAleatorio > num){
				System.out.println("te has quedado corto");
				
			
			}
		}while(numAleatorio > num || numAleatorio < num);
		
		
	}
}


