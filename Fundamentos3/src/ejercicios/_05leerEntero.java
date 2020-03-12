package ejercicios;

import java.util.Scanner;

public class _05leerEntero {
	public static void main(String[] args) {
		Scanner tec = new Scanner (System.in);	
		 
		 System.out.println("Introduce un numero entero");
		 int num ;
		 do{
			num = tec.nextInt();
			 if(num < 0){
				 System.out.println("Intentelo de nuevo");
				
			 }
			 
		 }while(num < 0);
		 System.out.println("Numero valido");
		 
		 
		 
		 
	}
	 
}

