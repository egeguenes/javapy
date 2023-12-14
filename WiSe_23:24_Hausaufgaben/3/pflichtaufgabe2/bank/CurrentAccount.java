package bank;

public class CurrentAccount extends Account {
	private double limit;

	public CurrentAccount( int accnum , double balance , double limit ) {
		super( accnum , balance );
		this.limit = limit;
	}
} 