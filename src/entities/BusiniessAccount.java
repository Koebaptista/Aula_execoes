package entities;

public class BusiniessAccount extends Account {
	
	private Double loanLimit;

	public BusiniessAccount () {
		super();
	}

	public BusiniessAccount(Integer number, String holder, Double balance, Double loanLimit) {
		super(number, holder, balance);
		this.loanLimit = loanLimit;
	}

	public Double getLoanLimit() {
		return loanLimit;
	}

	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}
	
	public void loan(Double amount) {
		
		if(this.loanLimit <= amount ) {
		
			balance = amount - 10.0;
		}
	}
}
