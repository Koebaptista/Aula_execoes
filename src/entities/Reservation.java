package entities;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Reservation {
	
	private Integer roomNumber;
	private LocalDate checkin;
	private LocalDate checkout;
	
	DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	public Reservation() {
		
	}

	public Reservation(Integer roomNumber, LocalDate checkin, LocalDate checkout) {
		this.roomNumber = roomNumber;
		this.checkin = checkin;
		this.checkout = checkout;
	}

	public Integer getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(Integer roomNumber) {
		this.roomNumber = roomNumber;
	}

	public LocalDate getCheckin() {
		return checkin;
	}

	public LocalDate getCheckout() {
		return checkout;
	}
	
	public Integer duration() {
		
		Duration duration = Duration.between(checkin, checkout);
		return (int) duration.toDays();
	}
public Integer duration2(LocalDate checkin) {
		
		Duration duration = Duration.between(this.checkin, checkin);
		return (int) duration.toDays();
	}
	public void updateDates(LocalDate checkin, LocalDate checkout) {
			this.checkin = checkin;
			this.checkout = checkout;
	}
	
	public String toString() {
		
		return "Reservation: Romm: " + roomNumber + ", check-in: " + checkin.format(fmt1) + ", check-out: " + checkout.format(fmt1) + ", " + duration() + "Days"; 
	}
	

}
