package exercicios;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus_1;


public class Apllication {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println("Enter cliente data:");
		System.out.print("name: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();
		System.out.print("Birth date (DD/MM/YYYY) ");
		String date = sc.nextLine();
		
		LocalDate date_birth = LocalDate.parse(date, fmt1);
		
		
		System.out.println("Enter order data:");
		System.out.print("Status:");
		String status = sc.nextLine();
		
		LocalDateTime moment = LocalDateTime.now();
		
		Order order = new Order(moment, OrderStatus_1.valueOf(status), new Client(name, email, date_birth));
		
		System.out.print("How many items to this order?");
		int n = sc.nextInt();
		
		OrderItem orderItem;
		
		for(int i = 0; i<n; i++) {
			
			System.out.println("Enter #" + (i+1) + " item data:");
			
			System.out.print("Product name: ");
			sc.nextLine();
			String name_prod = sc.nextLine();
			
			System.out.print("Product price:");
			Double price = sc.nextDouble();
			System.out.print("Quantity: ");
			int quantity = sc.nextInt();
		
			orderItem = new OrderItem(quantity, price, new Product(name, price));
			order.addItem(orderItem);
		}
		
		System.out.println();
		System.out.println("ORDER SUMMARY");
		
		System.out.println(order);
		
		
		
		
		sc.close();
	}

}
