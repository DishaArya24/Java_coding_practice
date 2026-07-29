package Searching_sortiing;

public class Upperbound {
	 public static int upperBound(int[] arr, int target) {

	        int low = 0;
	        int high = arr.length - 1;
	        int ans = arr.length;

	        while (low <= high) {

	            int mid = low + (high - low) / 2;

	            if (arr[mid] > target) {
	                ans = mid;
	                high = mid - 1;
	            } else {
	                low = mid + 1;
	            }
	        }

	        return ans;
	    }

	    public static void main(String[] args) {

	        int[] arr = {1, 2, 4, 4, 4, 6, 8};

	        System.out.println(upperBound(arr, 4));
	    }

}
