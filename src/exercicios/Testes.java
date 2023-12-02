package exercicios;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.Reservation;

public class Testes {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		Reservation reserv = new Reservation();
		
		System.out.print("Room number:");
		int roomNumber = sc.nextInt();
		
		System.out.println("Check-in date (dd/MM/yyyy):");
		sc.nextLine();
		String checkin = sc.nextLine();
		
		LocalDate dataIn1 = LocalDate.parse(checkin, fmt1);
		
		System.out.println("Check-out date (dd/MM/yyyy):");
		String checkout = sc.nextLine();
		
		LocalDate dataOut = LocalDate.parse(checkout, fmt1);
		
		if(duracaoEntre(dataIn1, dataOut) < 0 ) {
			System.out.println("Error in reservation: Check-out date must be after check-in date");
			
		}else {
			reserv = new Reservation(roomNumber, dataIn1, dataOut);
			System.out.println(reserv.toString());
		}
		
		System.out.println();
		//---------------------------------------------------------------
		
		System.out.println("Enter data to update the reservation:");
		System.out.println("Check-in date (dd/MM/yyyy):");
		sc.nextLine();
		checkin = sc.nextLine();
		
		LocalDate dataIn2 = LocalDate.parse(checkin, fmt1);
		
		System.out.println("Check-out date (dd/MM/yyyy):");
		checkout = sc.nextLine();
		
		dataOut = LocalDate.parse(checkout, fmt1);
		
		
		
		if(duracaoEntre(dataIn1, dataOut)< 0 ) {
			System.out.println("Error in reservation: Check-out date must be after check-in date");
		}
		else if (duracaoEntre(dataIn1, dataIn2) < 0){
			System.out.println("Error in reservation: Reservation dates for update must be future dates");
		}
		else {
			reserv.updateDates(dataIn2, dataOut);
			System.out.println(reserv.toString());
		}
		
		sc.close();
	}
	public static long duracaoEntre(LocalDate data1, LocalDate data2) {
		
		Duration drt = Duration.between(data1, data2);
		return drt.toDays();
		
	}
}
