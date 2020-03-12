package ejercicios;

import java.util.Scanner;

public class _12almacen {
	public static void main(String[] args) {
		Scanner tec = new Scanner (System.in);
		
		int pedidos = 0;
		int capMax = 500;
		int stock = capMax - pedidos;
		do{
			
			
			
			System.out.println("Introduzca cantidad a servir dia ");
			System.out.println("En stock: " + stock);
			pedidos = tec.nextInt();
			
			
			
			if (pedidos < 500 ){
				System.out.println("Pedido servido");
				stock -= pedidos;
				
			}else{
				System.out.println("Stock insuficiente");
			}
			
			
			if(stock<= 100){
				
				System.out.println("Stock minimo revasado");
				int stockRevasado= capMax - stock;
				System.out.println(stockRevasado);
				
			}
			if (capMax <= 100){
				System.out.println("Stock insuficiente");
				
				pedidos = capMax - pedidos;
				System.out.println(pedidos);
			}
			
	
				
			
			}while (pedidos != 0);
			System.out.println("fin del programa");
		}
	}


