package algorithmen;

public class Algorithmen{  
    /* 
     * Überprüft, ob ein Array aufsteigend sortiert ist.
     */
    public static boolean isSorted(int[] arr){
        for (int i = 0 ; i < arr.length ; i++) {
            for (int j = i+1 ; j < arr.length - 1 ; j++) {
                if (arr[i] >= arr[j]) {
                    return false;
                }
            }
        }
        return true;
    }
    
    
    /* 
     * Diese Funktion sortiert ein gegebenes Array und nutzt Seiteneffekte aus.
     */
    public static void sort(int[] arr){
        for (int i = arr.length - 1 ; i >= 0 ; i--) {
            for (int j = 0 ; j <= i - 1 ; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    
    }
    
    
    /* 
     * Diese Funktion überprüft mittels binärer Suche, ob das Array arr den Wert val enthält.
     * Darf nur sortierte Arrays erhalten.
     * Gibt nur zurück, ob val in arr enthalten ist.
     */
    public static boolean binarySearch(int[] arr, int val){
        assert isSorted(arr);
        int a=0;
        int b=arr.length;
        while(a != b) {
            int mid = (a + b) / 2;
            if (arr[mid] == val) {
                return true;
            }
            else {
                if (val < arr[mid]) {
                    b = mid;
                }
                else if (val > arr[mid]) {
                    a = mid + 1;
                }
                else {
                    continue;
                }
            }
        }
        return false;
    }
}