package Arrays;

import java.util.Scanner;

public class Largest {
	public static void main(String[] args) {
		
		System.out.println("Enter the Size of an Array");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int arr[] = new int [n];
		System.out.println("Enter the array elements : ");
		int largest = arr[0];
		
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int j=1;j<arr.length;j++) {
			if(arr[j]>largest) {
				largest = arr[j];
			}
		}
		
		System.out.println("The largest Number in the given array is " + largest);
		sc.close();
	}

}
