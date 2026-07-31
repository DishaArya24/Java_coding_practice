package Searching_sortiing;

public class Missing_number {
	/*
	 * Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.
	 */
	
	 public int missingNumber(int[] nums) {

	        int n = nums.length;

	        int expectedSum = n * (n + 1) / 2;

	        int actualSum = 0;

	        for (int num : nums) {
	            actualSum += num;
	        }

	        return expectedSum - actualSum;
	    }

	    public static void main(String[] args) {

	        Missing_number obj = new Missing_number();
	        System.out.println("Heyyy");

	        int[] nums = {3,0,1};

	        System.out.println(obj.missingNumber(nums));
	    }

}
