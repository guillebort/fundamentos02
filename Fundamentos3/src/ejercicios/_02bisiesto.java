package ejercicios;

import java.util.Scanner;

public class _02bisiesto {
	public static void main(String[] args) {
		Scanner tec = new Scanner (System.in);
	
		System.out.println("introduce ano");
		int anyo=tec.nextInt();
		
		System.out.println(EsBisiesto(anyo));
	}

	
	public static boolean EsBisiesto(int anyo){
		
		
	
		boolean bisiesto;
		if(anyo % 4 == 0 && anyo % 100 != 0 || anyo % 400 == 0 ){
		bisiesto = true;
		System.out.println("es bisiesto");
		} else {
		bisiesto = false;
		System.out.println("no es bisiesto");
	}
			return bisiesto;

	}
}

