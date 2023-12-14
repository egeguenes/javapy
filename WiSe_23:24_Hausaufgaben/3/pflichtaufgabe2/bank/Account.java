package bank;

public abstract class Account {
	private int accnum;
	private double balance;

	public Account( int accnum , double balance ) {
		this.accnum = accnum;
		this.balance = balance;
	}

	public void deposit( double amount ) {
		if ( amount >= 0 ) {
			this.balance += amount;
		}
	}

	public void withdraw( double amount ) {
		if ( this.balance - amount >= 0 && amount >= 0 ) {
			this.balance -= amount;
		}
	}
}