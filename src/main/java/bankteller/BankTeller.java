package bankteller;

import java.math.BigDecimal;

public class BankTeller {
	
	private BigDecimal balance = new BigDecimal(0);
	
	public BankTeller() {
		// Empty!
	}

	public BankTeller(int startingBalance) {
		balance = balance.add(new BigDecimal(startingBalance));
	}

	public BigDecimal getBalance() {
		return balance;
	}

	public void deposit(int amount) {
		balance = balance.add(new BigDecimal(amount));
		
	}

	public void withdraw(int withdrawal) {
		balance = balance.subtract(new BigDecimal(withdrawal));
		
	}
}
