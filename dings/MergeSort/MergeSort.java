import java.util.Scanner;

// a code to mergesort an array that gets the length and the elements of array from the suer itself

public class MergeSort {

    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Input the size of the array to be sorted : ");
        int arraySize = scan.nextInt();
        int[] array = new int[arraySize];

        for (int i = 0; i < arraySize ; i++) {
            System.out.println();
            System.out.print("The " + (i+1) + ". Element of the Array : ");
            array[i] = scan.nextInt();
        }
        System.out.println();
        mergeSort(array);
        printArray(array);
    }
	
	public static void mergeSort(int[] inputArray) {
        int inputLength = inputArray.length;

        if (inputLength < 2) {
            return;
        }

        // the left and the right arrays are created and filled
        int midIndex = inputLength / 2;
        int[] leftHalf = new int[midIndex];
        int[] rightHalf = new int[inputLength - midIndex];

        for (int i = 0; i < midIndex ; i++) {
            leftHalf[i] = inputArray[i];
        }

        for (int i = 0; i < inputLength - midIndex ; i++) {
            rightHalf[i] = inputArray[midIndex + i];
        }

        // recursively dividing the left and the right arrays
        mergeSort(leftHalf);
        mergeSort(rightHalf);

        // merges and sortes them
        merge(inputArray , leftHalf , rightHalf);
    }

    public static void merge(int[] inputArray , int[] leftHalf , int[] rightHalf) {
        int leftSize = leftHalf.length;
        int rightSize = rightHalf.length;

        int i = 0, j = 0, k = 0;

        // compares the first element of the left array with the first element of the right array, accordingly filels the first index of the merged array 
        while (i < leftSize && j < rightSize) {
            if (leftHalf[i] <= rightHalf[j]) {
                inputArray[k] = leftHalf[i];
                i++;
            } else {
                inputArray[k] = rightHalf[j];
                j++;
            }
            k++;
        }

        // if there is an left out element from any array, it gets added
        while (i < leftHalf.length) {
            inputArray[k] = leftHalf[i];
            i++;
            k++;
        }
        while (j < rightHalf.length) {
            inputArray[k] = rightHalf[j];
            j++;
            k++;
        }
    }

    // printing the array
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}