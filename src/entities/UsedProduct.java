package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class UsedProduct extends Product2 {
	private LocalDate date;
	
	DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	public UsedProduct() {
		super();
	}

	public UsedProduct(String name, Double price, LocalDate date) {
		super(name, price);
		this.date = date;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}
	@Override
	public final String priceTag() {
		
		return super.priceTag() + " (Manufacture date: " + date.format(fmt1)+ ")";
		
	}
	
}
