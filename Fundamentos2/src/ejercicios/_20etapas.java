package ejercicios;

import java.util.Scanner;

public class _20etapas {
	public static void main(String[] args) {
		Scanner tec = new Scanner (System.in);
		
		System.out.println("Introduce una edad: ");
		int edad = tec.nextInt();
		
		if(edad<= 10){
			System.out.println("Infancia: ");
		}else if(edad<=14){
			System.out.println("Pubertad");
		}else if(edad<=21){
			System.out.println("Adolescencia");
		}else if(edad<=55){
			System.out.println("Adultez");
		}else if(edad<=70){
			System.out.println("Vejez");
		}else if(edad>=71){
			System.out.println("Ancianidad");
		}
	}

}
