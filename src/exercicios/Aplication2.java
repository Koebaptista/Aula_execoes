package exercicios;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product2;
import entities.UsedProduct;

public class Aplication2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println("Digite quantos produtos serao cadastrados:");
		int n = sc.nextInt();
		
		List<Product2> lista = new ArrayList<>();
		Product2 product2;
		for (int i = 0; i<n; i++) {
			System.out.println("Product #"+ (i+1) + " data:");
			System.out.print("Common, used or imported (c/u/i)?");
			char resposta = sc.next().charAt(0);
			
			System.out.print("Name:");
			sc.nextLine();
			String name = sc.nextLine();
			
			System.out.print("Price");
			Double price = sc.nextDouble();
			
			if (resposta == 'c') {
				product2 = new Product2(name, price);
				lista.add(product2);
			}
			 else if(resposta == 'i') {
				System.out.print("Customs fee:");
				double custonsFee = sc.nextDouble();
				product2 = new ImportedProduct(name, price, custonsFee);
				lista.add(product2);
			}else {
				System.out.print("Manufacture date (DD/MM/YYYY):");
				sc.nextLine();
				String date = sc.nextLine();
				LocalDate data01 = LocalDate.parse(date, fmt1);
				product2 = new UsedProduct(name, price, data01);
				lista.add(product2);
				}
			
			}
		
			System.out.println("Price Tags");
			
			for (Product2 x : lista) {
				System.out.println(x.priceTag());
		}
		sc.close();

	}

}
