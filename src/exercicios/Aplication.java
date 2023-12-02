package exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Aplication {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o numero de funcionarios");
		int n = sc.nextInt();
		Employee emp;
		List <Employee> emp_list = new ArrayList<>();
		
		for (int i = 0; i < n ; i++) {
			System.out.println("Employee #" + (i+1) + " data:");
			System.out.print("Outsourced (y/n)?");
			char resposta = sc.next().charAt(0);
			
			System.out.print("Name");
			sc.nextLine();
			String name = sc.nextLine();
			
			System.out.print("Hours");
			int hours = sc.nextInt();
			
			System.out.print("Value per hour");
			double valuePerHour = sc.nextDouble();
			
			if(resposta == 'y') {
				System.out.println("Additional charge:");
				Double additional = sc.nextDouble();
				
				emp = new OutsourcedEmployee(name, hours, valuePerHour, additional);
				emp_list.add(emp);
				
			} else {
				emp = new Employee(name, hours, valuePerHour);
				emp_list.add(emp);
			}
		}
		
		for(Employee c : emp_list) {
			System.out.println(c.toString());
			}
		
		
		
		
		sc.close();
	}

}
