package Arrays;

import java.util.Scanner;

public class Missing_Number {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int n = sc.nextInt();
		int[]arr = new int[n];
		System.out.println("Enter the array elements: ");
		for(int i=0;i<n-1;i++) {
			arr[i]=sc.nextInt();
		}
		
		int expectedSum = n*(n+1)/2;
		int actualSum = 0;
		
		for(int i=0;i<n-1;i++) {
			actualSum += arr[i];
		}
		
		int missing = expectedSum - actualSum;
		System.out.println("Missing Number = " + missing);
		sc.close();
		
		
	}

}
