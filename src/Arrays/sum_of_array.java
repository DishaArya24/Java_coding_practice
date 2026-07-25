package Arrays;

import java.util.Scanner;

public class sum_of_array {
	/*
	 * write a program to find the sum of all the elements in the array
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int n = sc.nextInt();
		int[]arr = new int[n];
		
		System.out.println("Enter the elements of an array : ");
		for(int i=0;i<n;i++) {
			arr[i] =sc.nextInt();
		}
	
		
		int sum = 0;
		
		for(int i =0;i<arr.length;i++) {
			
			sum += arr[i];
		}
		System.out.println(sum);
		
	}

}


