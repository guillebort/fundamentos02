package ejercicios;

import java.util.Scanner;

public class _04Switch {
	public static void main(String[] args) {
		Scanner tec = new Scanner (System.in);
		
	
	System.out.println("Introduce nombre del dia");
	int dia=tec.nextInt();
		System.out.println(nombreDiaSemana(dia));
		
	}
	public static String nombreMes (int mes){
		String nombreMes;
		switch(mes){
		case 1:
			nombreMes = "enero";
			break;
		case 2:
			nombreMes = "febrero";
			break;
		case 3 :
			nombreMes ="marzo";
			break;
		case 4:
			nombreMes = "abril";
			break;
		case 5:
			nombreMes = "mayo";
			break;
		case 6:
			nombreMes = "junio";
			break;
		case 7:
			nombreMes = "julio";
			break;
		case 8:
			nombreMes = "agosto";
			break;
		case 9:
			nombreMes = "septiembre";
			break;
		case 10:
			nombreMes = "octubre";
			break;
		case 11:
			nombreMes = "noviembre";
			break;
		case 12:
			nombreMes = "diciembre";
			break;
			default:
				nombreMes = "no hay mas meses";
				
		}
		return nombreMes;
	}
	public static String estacionDelAnyo (int mes){
		String estacionDelAnyo;
		switch(mes){
		case 1:
			
		case 2:
			
		case 3 :
			
		case 4:
			estacionDelAnyo = "primavera";
			break;
		case 5:
			
		case 6:
			
		case 7:
			estacionDelAnyo = "verano";
			break;
		case 8:
			
		case 9:
			
		case 10:
			estacionDelAnyo = "otoño";
			break;
		case 11:
			
		case 12:
			estacionDelAnyo ="invierno";
			break;
			default:
				estacionDelAnyo ="no hay mas meses";
		}
		return estacionDelAnyo ;
	}
	public static int numeroDiaSemana (String dia){
		int numDia = 0;
		switch(dia){
		case "lunes":
			numDia = 1;
			break;
		case "martes":
			numDia = 2;
			break;
		case "miercoles":
			numDia = 3;
			break;
		case "jueves":
			numDia=4;
			break;
		case "viernes":
			numDia=5;
			break;
		case "sabado":
			numDia=6;
			break;
		case "domingo":
			numDia=7;
			break;
			default:
			 System.out.println("no hay mas dias");
				
			
		}
		return numDia;
	}
	public static String nombreDiaSemana (int dia){
		String  nombreDiaSemana ="" ;
		switch(dia){
		case 1: 
			 nombreDiaSemana = "lunes";
			break;
		case 2:
			 nombreDiaSemana = "martes";
			break;
		case 3:
			 nombreDiaSemana = "Miercoles";
			break;
		case 4:
			 nombreDiaSemana ="jueves";
			break;
		case 5:
			 nombreDiaSemana = "viernes";
			break;
		case 6:
			 nombreDiaSemana = "sabado";
			break;
		case 7:
			 nombreDiaSemana ="domingo";
			 break;
			 
			default:
				System.out.println("no hay mas dias");
		}
		return nombreDiaSemana;
	}

}
