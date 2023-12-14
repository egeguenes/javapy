package bank;

public class CurrentAccount extends Account {
	private double limit;

	public CurrentAccount( int accnum , double balance , double limit ) {
		assert balance >= 100.00;
		super( accnum , balance );
		this.limit = limit;
	}

	
} 