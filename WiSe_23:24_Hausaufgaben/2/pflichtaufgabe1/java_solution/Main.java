import algorithmen.Algorithmen;
import java.util.Random;

public class Main{
    
    public static void main(String[] args){
        /*
         * Ab hier soll die main-Methode implementiert werden.
         * Methoden aus Algorithmen.java können mit Algorithmen.Methodennamen(...) aufgerufen werden.
         */
        int[] arr = new int[10];

        Random rnd = new Random();

        for (int i = 0 ; i < arr.length - 2; i++) {
            arr[i] = rnd.nextInt(101);
        }

        arr[arr.length - 1] = -17;

        System.out.println("Array is sorted : " + Algorithmen.isSorted(arr));
        
        Algorithmen.sort(arr);

        System.out.println("Value -17 is in Array : " + Algorithmen.binarySearch(arr , -17));

        System.out.println("Array is now sorted : " + Algorithmen.isSorted(arr));

        System.out.println("Value 1000 is in Array : " + Algorithmen.binarySearch(arr , 1000));
    }
}