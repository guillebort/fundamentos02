package ejercicios;

import java.util.Scanner;

public class _23Circulo {
	public static void main(String[] args) {
		Scanner tec = new Scanner (System.in);
		
		System.out.println("introduce valor del radio: ");
		
		
	}
		public static double longitudCircunferencia (double radio){
			double longitud = Math.PI * 2 * radio;
			
			return longitud;
			
		}
		public static double areaCirculo (double radio){
			double area = Math.PI * Math.pow(radio, 2);
			
			return area;
			
		}
		public static double volumenEsfera (double radio){
			double volumen = 4/3 * Math.PI * Math.pow(radio, 3);
			
			return volumen;
			
		}
	}



