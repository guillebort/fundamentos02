package ejercicios;

import java.util.Scanner;

public class _12calculadora {
	public static void main(String[] args) {
		Scanner tec = new Scanner (System.in);
		
		System.out.println("Primer numero:");
		double num1 = tec.nextDouble();
		
		System.out.println("Segundo numero: ");
		double num2 = tec.nextDouble();
		
		System.out.println("Operacion: ");
		String operacion = tec.next();
		
		
		if(operacion.equals("+")){
			System.out.println(num1 + num2);
		}
		if(operacion.equals("-")){
			System.out.println(num1 - num2);
		}
		if(operacion.equals("*")){
			System.out.println(num1 * num2);
		}
		if(operacion.equals("/")){
			System.out.println(num1 / num2);
		}
	}

}
