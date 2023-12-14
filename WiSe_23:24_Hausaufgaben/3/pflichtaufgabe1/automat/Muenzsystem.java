package automat;

public class Muenzsystem {
	private int[] validCoins = { 1 , 2 , 5 , 10 , 20 , 50 , 100 , 200 };
	private int[] insertedCoins;
	private int[] currentCoins;

	public Muenzsystem( int[] insertedCoins , int[] currentCoins ) {
		this.insertedCoins = insertedCoins;
		this.currentCoins = currentCoins;
	}

	public boolean insert( int coin ) {
		for ( int i = 0 ; i < this.validCoins.length ; i++ ) {
			if ( coin == this.validCoins[i] ) {
				return true;
			}
		}
		return false;
	}

	public boolean buy( int price ) {

	}

	public void reset() {

	}

	public int[] getValidCoins() {
		return validCoins;
	}

	public void setValidCoins( int[] validCoins ) {
		this.validCoins = validCoins;
	}

	public int[] getInsertedCoins() {
		return insertedCoins;
	}

	public void setInsertedCoins( int[] insertedCoins ) {
		this.insertedCoins = insertedCoins;
	}

	public int[] getCurrentCoins() {
		return currentCoins;
	}

	public void setCurrentCoint( int[] currentCoins ) {
		this.currentCoins = currentCoins;
	}
}
