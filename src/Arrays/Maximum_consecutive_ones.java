package Arrays;

import java.util.Scanner;

public class Maximum_consecutive_ones {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n = sc.nextInt();
		System.out.println("Enter the Size of an Array");
		int[]arr = new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i] =sc.nextInt();
		}
		
		int count = 0;
		int maxCount =0;
		
		for(int i=0;i<n;i++) {
			if(arr[i]==1) {
				count++;
				
				if(count>maxCount) {
					maxCount = count;
				}
			}else {
				count =0;
				
			}
		}
		System.out.println("Maximum Consecutive Ones = "+maxCount);
		sc.close();
	}

}
