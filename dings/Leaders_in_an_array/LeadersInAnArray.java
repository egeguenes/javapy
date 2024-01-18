import java.util.*;

public class LeadersInAnArray {

	/* Given an array A of positive integers. Your task is to find the leaders in the array. 
	An element of array is a leader if it is greater than or equal to all the elements to its right side. 
	The rightmost element is always a leader.
	*/ 

	static ArrayList<Integer> leaders(int arr[], int n){
        ArrayList<Integer> nums = new ArrayList<Integer>(); 
        int sum = arr[n-1];
        nums.add(arr[n-1]);
        for ( int i = n-2 ; i >= 0 ; i-- ) {
            if ( arr[i] >= sum ) {
                nums.add(arr[i]);
            }
            sum += arr[i];
        }
        Collections.reverse(nums);
        return nums;
    }

}