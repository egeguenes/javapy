package bank;

public class SavingsAccount extends Account {
	private double interestRate;

	public SavingsAccount( int accnum , double balance , double interestRate ) {
		super( accnum , balance );
		this.interestRate = interestRate;
	}

	@Override
	public void withdraw( double amount ) {
		if ( this.balance - amount >= 100.00 ) {
			this.balance -= amount;
		}
	}

	public void interest() {
		this.balance += ( this.balance / interestRate );
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate( double interestRate ) {
		this.interestRate = interestRate;
	}
}