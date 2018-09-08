package bankteller;

import static org.junit.Assert.assertTrue;

import java.math.BigDecimal;

import org.junit.Test;

public class BankTellerTest {

	@Test
	public void shouldBeAbleToCreateBankTeller() {
		BankTeller teller = new BankTeller();
	}
	
	@Test
	public void shouldBeAbleToCheckBalance() {
		BankTeller teller = new BankTeller();
		BigDecimal balance = teller.getBalance();
		assertTrue(balance.equals(new BigDecimal(0)));
		
		// reminder: demo .compareTo()
	}
	
	@Test
	public void shouldBeAbleToStartWithBalance() {
		// Arrange
		BankTeller teller = new BankTeller(100);
		// Act
		BigDecimal balance = teller.getBalance();
		// Assert
		assertTrue(balance.equals(new BigDecimal(100)));
	}
	@Test
	public void shouldBeAbleToDeposit() {
		// Arrange
		BankTeller teller = new BankTeller(5000);
		// Act
		teller.deposit(500);
		BigDecimal balance = teller.getBalance();
		// Assert
		assertTrue(balance.equals(new BigDecimal(5500)));
	}
	
	@Test
	public void shouldBeAbleToWithdraw() {
		// Arrange
		BankTeller teller = new BankTeller(1030);
		// Act
		teller.withdraw(1020);
		BigDecimal balance = teller.getBalance();
		// Assert
		assertTrue(balance.equals(BigDecimal.valueOf(10)));
	}
	
}
