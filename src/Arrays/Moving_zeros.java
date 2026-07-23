package Arrays;

import java.util.Arrays;

public class Moving_zeros {
	public static void main(String[] args) {
		int[]arr= {1,0,2,0,4,3,8,0};
		int []result = new int[arr.length];
	
		int index = 0;
		
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0) {
				result[index] = arr[i];
				index++;
			}
			
		}
		System.out.println(Arrays.toString(result));
	}

}
