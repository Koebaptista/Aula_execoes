package exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Contribuintes;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class Apllication2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Contribuintes> lista = new ArrayList<>();
		Contribuintes contr;
		System.out.println("digite quantos pagantes serao");
		int n = sc.nextInt();
		
		for(int i = 0; i<n; i++) {
			System.out.println("Individual or company (i/c)?");
			char resposta = sc.next().charAt(0);
			System.out.println("Tax payer #" + (i+1)+ " data:");
			System.out.print("Name");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Anual income: ");
			double renda = sc.nextDouble();
			
			if (resposta == 'i') {
				
				System.out.print("Health expenditures:");
				double gastoSaude = sc.nextDouble();
				contr = new PessoaFisica(name, renda, gastoSaude);
				lista.add(contr);	
			}
			else {
				System.out.print("Number of employees: ");
				int numeroFuncionario = sc.nextInt();
				lista.add(new PessoaJuridica(name, renda, numeroFuncionario));
			}
		}
		
		for (Contribuintes x : lista) {
			System.out.println(x.getName()+" R$"+String.format("%.2f", x.imposto()));
		}
		
		System.out.println("Total Taxes");
		Double soma = 0.0;
		for(Contribuintes x : lista) {
			soma += x.imposto();
		}
		System.out.println(String.format("%.2f", soma));
		
		sc.close();
	}

}
