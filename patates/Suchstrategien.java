public class Suchstrategien {
	
	public static void main( String[] args ) {
		int[] patat = new int[32];
		for ( int i = 1 ; i < 33 ; i++ ) {
			patat[i-1] = i * 3;
		}
		System.out.println(binarySearch(patat , 18));
		System.out.println(iterativeSearch(patat , 18));
	}

	public static int iterativeSearch( int[] arr , int num ) {
		int rounds = 0;
		for ( int i = 0 ; i < arr.length ; i++ ) {
			rounds++;
			if ( arr[i] == num ) {
				return i;
			}
		}
		return -1;
	}

	public static int binarySearch( int[] arr , int num ) {
		int rounds = 0;
		int length = arr.length;
		int control = 0;
		while ( rounds != length ) {
			rounds++;
			control = ( ( ( rounds + length ) / 2.0 ) - 0.5) >= ( rounds + length / 2 ) ? ( rounds + length / 2 ) + 1 : ( rounds + length / 2 );

			if ( num <= arr[rounds] ) {
				length = control; 
			} else {
				rounds = control++;
			}
		}
		if ( num == rounds ) {
			return rounds;
		}
		return -1;
	}
}