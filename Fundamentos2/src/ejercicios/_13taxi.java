package ejercicios;

import java.util.Scanner;

public class _13taxi {
	public static void main(String[] args) {
		Scanner tec = new Scanner (System.in);
		
		
		System.out.println("Momento del trayecto: DIA O NOCHE");
		String dia = tec.nextLine();
		String noche = tec.nextLine();
		
		System.out.println("Introduce km: ");
		double km = tec.nextDouble();
		
		System.out.println("Dia de la semana: ");
		int diaSemana = tec.nextInt();
		if(diaSemana < 6){
			double diaLab = 0.73/km;
			double mañana = diaLab + 2.95; 
			System.out.println(mañana);
			
		}
		
		
		
		double nocheLab = 0.84/km;
		double domingos = 0.93/km;
		
		
	
			
		
		
	}

}
