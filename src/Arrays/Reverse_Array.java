package Arrays;

import java.util.Scanner;

public class Reverse_Array {
	public static void main(String[] args) {
		System.out.println("Enter the array size");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("Enter the Elements");
		
		int[]arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		int start = 0;
		int end = n-1;
		
		while(start<end) {
			int temp = arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			
			start++;
			end--;
		}
		
		System.out.println("Reversed Array: ");
		
		for(int i=0;i<n;i++) {
			System.out.println (arr[i]+" ");
		}
		sc.close();
	}

}
