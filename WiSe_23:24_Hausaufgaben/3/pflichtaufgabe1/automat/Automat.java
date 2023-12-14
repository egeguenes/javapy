package automat;

public class Automat {
	private Muenzsystem ms;
	private Ware[] waren;

	public Automat( Muenzsystem ms , Ware[] waren ) {
		this.ms = ms;
		this.waren = waren;
	}

	public boolean insertCoin( int coin ) {
		return this.ms.insert( coin );
	}

	public boolean select( int id ) {
		return this.ms.buy( this.waren[id].getPrice() );
	}

	public void abort() {
		// alle münzen kommen zurück
	}

	public void printWare() {
		for ( int i = 0 ; i < this.waren.length ; i++ ) {
			System.out.println( this.waren[i].toString() );
		}
	}
}