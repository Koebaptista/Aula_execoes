package exercicios;

import java.util.Locale;
import java.util.Scanner;
import entities.Pedido;
import entities.enums.Order_Status;
import java.util.Date;

public class Exercicio_Enum_1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Pedido pedido = new Pedido(1080, new Date(), Order_Status.Aguardando);
		
		System.out.println(pedido);
		
		Order_Status os1 = Order_Status.Entregue; 
		
		Order_Status os2 = Order_Status.valueOf("Entregue");
		
		System.out.println(os1);
		
		System.out.println(os2);
		
		sc.close();
	}

}
