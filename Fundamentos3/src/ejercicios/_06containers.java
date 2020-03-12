package ejercicios;

import java.util.Scanner;

public class _06containers {
	public static void main(String[] args) {
		Scanner tec = new Scanner (System.in);
	
		int capacidad=0;
		System.out.println("Introduce toneladas introducidas en el buque ");
		int toneladas;
		do{
			toneladas = tec.nextInt();
			if(toneladas < 700){
				System.out.println("Sigue introduciendo hasta llegar a 700. Llevas " + toneladas + " toneladas");
				
			}else{
				System.out.println("Capacidad maxima");
			}
		}while(toneladas < 700);
		System.out.println("suficiente si es necesario vacia hasta llegar a 700");
		
		System.out.println("Introduce el numero de containers");
		int containers;

		do{
			
			
			containers= tec.nextInt();
			
			if(containers < 100){
				
				System.out.println("sigue introduciendo hasta llegar a 100 containers");
			}else{
				System.out.println("capacidad maxima no se pueden meter mas. vacia hasta llegar a 100");
			}
		}while(containers < 100);
		System.out.println("ya esta");
	}

}
