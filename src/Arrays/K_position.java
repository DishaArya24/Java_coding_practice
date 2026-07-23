package Arrays;

import java.util.Scanner;

public class K_position {
	
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	int []arr= {24,23,45,67,89};
	int n = arr.length;
	
	System.out.println("Enter the value of k: ");
	int k = sc.nextInt();
	k = k%n;
	
	int[] result = new int[n];
	int index = 0;
	
	//copy elements from k to end
	for(int i=k;i<n;i++) {
		result[index]=arr[i];
		index++;
	}
	
	//copy first k elements
	for(int i=0;i<k;i++) {
		result[index]=arr[i];
		index++;
	}
	
	System.out.println("Array after left rotation: ");
	for(int i=0;i<n;i++) {
		System.out.println(result[i]+" ");
	}
	sc.close();
	
	
}


}
