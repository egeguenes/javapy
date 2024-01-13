public class MergeSort {
	
	public static void merge(int[] array, int left, int middle, int right) {
		
		int[] leftArray = new int[middle-left];
        int[] rightArray = new int[right - middle];

		for (int i = 0; i < leftArray.length; ++i){
            leftArray[i] = array[left + i];
        }
        for (int i = 0; i < rightArray.length; ++i){
            rightArray[i] = array[middle + i];
        }

        int l = 0;
        int r = 0;

        


	}
}