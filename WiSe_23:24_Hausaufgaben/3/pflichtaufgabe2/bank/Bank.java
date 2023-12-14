package bank;

public class Bank {
	private Account[] accounts;

	public Bank() {

	}

	public void update() {
		for ( int i = 0 ; i < this.accounts.length ; i++ ) {
			if ( accounts[i] instanceof SavingsAccount ) {
				accounts[i].interest();
			}
		}
	}

	public int open( boolean wert ) {

	}

	public boolean close( int wert ) {

	}

	public void deposit( int amount , double dAmount ) {

	}

	public void withdraw( int amount , double dAmount ) {

	}
}