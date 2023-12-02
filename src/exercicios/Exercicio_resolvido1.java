package exercicios;

import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;
import java.time.LocalDate;
import entities.Trabalhador;
import java.util.List;
import java.util.ArrayList;
import entities.Contrato_hora;
import entities.enums.Worker_Level;
import entities.Departamento;


public class Exercicio_resolvido1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in); 
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("MM/yyyy");
		
		System.out.print("Escreva o nome do departamento ");
		String nome_depart = sc.nextLine();
		
		System.out.println("Digite os dados do Trabalhador");
		System.out.print("Nome:");
		String nome = sc.nextLine();
		System.out.print("Level:");
		String level_Worker = sc.nextLine();
		System.out.print("Salario base:");
		Double salario = sc.nextDouble();
		
		//Worker_Level level = Worker_Level.valueOf(level_Worker);
		//Departamento depart = new Departamento(nome_depart);
		//trab.setDepart(depart.getNome());
		
		Trabalhador trab = new Trabalhador(nome, Worker_Level.valueOf(level_Worker), salario, new Departamento(nome_depart));
		
		System.out.print("Digite quantos contratos ele tem");
		int n = sc.nextInt();
		
		for (int i = 0; i<n; i++) {
			System.out.println("Contrato numero #" + (i+1));
			System.out.print("Data: ");
			sc.nextLine();
			String data0 = sc.nextLine();
			
			LocalDate data1 = LocalDate.parse(data0,fmt1);
			
			System.out.println("Valor por hora:");
			Double valor_hora = sc.nextDouble();
			
			System.out.println("Duração");
			int duracao = sc.nextInt();
			
			Contrato_hora contract = new Contrato_hora(data1, valor_hora, duracao);
			trab.AddContract(contract);
		}
		
		System.out.println("Digite o ano e o mes para calcular os ganhos (MM/yyyy)");
		sc.nextLine();
		String data03 = "01/" + sc.nextLine();
		
		LocalDate data4 = LocalDate.parse(data03, fmt1);
		
		int ano = data4.getYear();
		int mes = data4.getMonthValue();
		
		Double soma = trab.income(ano, mes);
		
		System.out.println("Nome:" + trab.getNome());
		System.out.println("Departamento: "+ trab.getDepart().getNome());
		System.out.println("Ganhos de " + mes + "/" + ano +":" + String.format("%.2f", soma));
		
		
		
		sc.close();
	}
}
