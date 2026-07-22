package Arrays;

import java.util.Scanner;

public class Smallest {
	public static void main(String[] args) {
		System.out.println("Enter the Size of an Array");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int arr[] = new int [n];
		System.out.println("Enter the array elements : ");
		
		
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		int smallest = arr[0];
		
		for(int j=1;j<arr.length;j++) {
			if(arr[j]<smallest) {
				smallest = arr[j];
			}
		}
		
		System.out.println("The smallest Number in the given array is " + smallest);
		sc.close();
	}

}
