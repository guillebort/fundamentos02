package ejercicios;

import java.util.Scanner;

public class _11adivinarNumero2 {
	public static void main(String[] args) {
		Scanner tec = new Scanner (System.in);
		
		System.out.print("Numero a adivinar: ");
		int numAleatorio = (int) (Math.random()* 100);
		System.out.println(numAleatorio);
		
		int num = 0;
		
		
		do{
			for(int i = 1; i <= 5; i++){
			System.out.println("intentos: " + i);
			if(i == 5){
				System.out.println("Ultimo intento");
			}
			
				
			System.out.println("Adivina el numero");
			num = tec.nextInt();
			
			if(numAleatorio == num){
			System.out.println("Has acertado");
				
			}else if(numAleatorio < num){
			System.out.println("Te has pasado");
				
			}else{
				System.out.println("te has quedado corto");
				
			}	
			
			
			}
				tec.nextInt();
			
		}while(numAleatorio < num || numAleatorio > num  );
		
		
		
		
		
	}
}
