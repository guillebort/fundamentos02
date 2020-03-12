package ejercicios;

import java.util.Scanner;

public class _12_2almacen {
	public static void main(String[] args) {
		Scanner tec = new Scanner (System.in);
		
		int capMax=500;
		int stockMin=100;
		int pedidos=0;
		int stock = capMax - pedidos;
	
		do{
		for(int i = 1; i < 7; i++){
		
		System.out.println("Introduce pedido para dia " + i);
	
		pedidos=tec.nextInt();
		
		
		if(pedidos> stock ){
			System.out.println("pedido insuficiente");
			
			
		}else{
			 stock-=pedidos;
			System.out.println("Pedido servido");
			System.out.println("Queda en el almacen: " + stock);
		}
		if(stock<100){
			int compra=500 - stock;
			
			System.out.println("Se compra " + compra +  " unidades");
			stock=500;
			System.out.println("Queda en el almacen: " + stock);
		}

		}
		}while(pedidos !=0);
		System.out.println("Fin del programa.");
	}

}
