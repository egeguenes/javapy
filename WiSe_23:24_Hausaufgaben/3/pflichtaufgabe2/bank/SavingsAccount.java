package bank;

public class SavingsAccount extends Account {
	private double interestRate;

	public SavingsAccount( int accnum , double balance , double interestRate ) {
		super( accnum , balance );
		this.interestRate = interestRate;
	}
}