package entities;

public class ImportedProduct extends Product2 {
	private Double custonsFee;
	
	public ImportedProduct() {
		super();
	}

	public ImportedProduct(String name, Double price, Double custonsFee) {
		super(name, price);
		this.custonsFee = custonsFee;
	}

	public Double getCustonsFee() {
		return custonsFee;
	}

	public void setCustonsFee(Double custonsFee) {
		this.custonsFee = custonsFee;
	}

	public Double totalPrice() {
		
		return price + custonsFee;
	}
	@Override
	public final String priceTag() {
		
		return getName() + " (used) " + String.format("%.2f", totalPrice()) + " (Custons Fee: R$" + String.format("%.2f", custonsFee) + ")"; 
	}
}
