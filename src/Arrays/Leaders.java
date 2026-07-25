package Arrays;

import java.util.Scanner;

public class Leaders {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Array size");
		int num = sc.nextInt();
		
		int[] arr = new int[num];
		System.out.println("Enter the elements of an array: ");
		for(int i=0;i<num;i++) {
			arr[i] = sc.nextInt();
			
		}
		
		int left = 0;
		int right = arr.length-1;
		
		for(int i=0;i<arr.length;i++) {
			boolean leader = true;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]>arr[i]) {
					leader =false;
					break;
					
				}
				
				 
			}
			if(leader) {
				System.out.println("Leaders of array is : " +arr[i] );
			}
		}
	}

}
