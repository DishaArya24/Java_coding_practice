package Sliding_Window;

public class ProductEquivalentSubarray {
	
	

	    public int maxLength(int[] nums) {

	        int n = nums.length;
	        int max = 0;

	        for (int i = 0; i < n; i++) {

	            long product = 1;
	            int gcdValue = 0;
	            long lcmValue = 1;

	            for (int j = i; j < n; j++) {

	                product *= nums[j];

	                if (gcdValue == 0)
	                    gcdValue = nums[j];
	                else
	                    gcdValue = gcd(gcdValue, nums[j]);

	                lcmValue = lcm(lcmValue, nums[j]);

	                if (product == (long) gcdValue * lcmValue) {
	                    max = Math.max(max, j - i + 1);
	                }
	            }
	        }

	        return max;
	    }

	    private int gcd(int a, int b) {

	        while (b != 0) {
	            int temp = b;
	            b = a % b;
	            a = temp;
	        }

	        return a;
	    }

	    private long lcm(long a, long b) {

	        return (a * b) / gcd((int) a, (int) b);
	    }

	    public static void main(String[] args) {

	        ProductEquivalentSubarray obj = new ProductEquivalentSubarray();

	        int[] nums = {1,2,1,2,1,1,1};

	        System.out.println(obj.maxLength(nums));
	    }
	}


