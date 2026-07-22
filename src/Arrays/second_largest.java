package Arrays;

import java.util.Scanner;

public class second_largest {
	public static void main(String[] args) {
		System.out.println("Enter the Size of an array");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		
		int[] arr = new int [n];
		System.out.println("Enter your array elements");
		
		
		
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		int largest = arr[0];
		int second_largest = arr[0];
		
		for(int j=1;j<arr.length;j++) {
			if(arr[j]>largest) {
				second_largest = largest;
				largest = arr[j];
			}
			else if (arr[j]>second_largest && arr[j] != largest) {
				second_largest = arr[j];
			}
			
		}
		
		System.out.println("The second largest Element is : " + second_largest);
	}

}
