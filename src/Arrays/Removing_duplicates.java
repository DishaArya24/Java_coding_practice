package Arrays;

import java.util.Scanner;

public class Removing_duplicates {
	public static void main(String[] args) {
		
		System.out.println("Enter the Size of an array");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		System.out.println("Enter the elements of Array");
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] =sc.nextInt();
		}
		
		//checking if array is sorted
		boolean sorted  = true;
		
		for(int i=0;i<n-1;i++) {
			if(arr[i]>arr[i+1]) {
				sorted = false;
				break;
			}
		}
		
		if(!sorted) {
			System.out.println("The array is not sorted");
			sc.close();
			return;
		}
		
		//remove duplicates
		int i = 0;
		for(int j=1;j<n;j++) {
			if(arr[i] !=arr[j]) {
				i++;
				arr[i]=arr[j];
			}
		}
		System.out.println("Array after removing duplicates: ");
		
		for(int k=0;k<=i;k++) {
			System.out.print(arr[k]+" ");
		}
		sc.close();
		}

}
