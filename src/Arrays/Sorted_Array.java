package Arrays;

import java.util.Scanner;

public class Sorted_Array {

	public static void main(String[] args) {
		System.out.println("Enter the Size of an Array");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int arr[] = new int [n];
		System.out.println("Enter the array elements : ");
		
		
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		boolean sorted = true;
		
		for(int j=0;j<n-1;j++) {
			if(arr[j]>arr[j+1]) {
			sorted = false;
			break;
			}
		}
		if(sorted) {
			System.out.println("The given array is sorted ");
			
		}
		else {
			System.out.println("the given array is not sorted");
		}
		sc.close();
	}
}
