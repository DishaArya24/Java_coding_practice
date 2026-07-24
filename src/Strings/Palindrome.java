package Strings;

import java.util.Scanner;

public class Palindrome {
	
	public static boolean ispalindrome(String str) {
		
		int left = 0;
		int right = str.length()-1;
		while(left<right) {
			if(str.charAt(left) != str.charAt(right)) {
				return false;
			}
			
			left ++;
			right --;
			
		}
		
		return true;
		
	}
	
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a String: ");
		String str = sc.nextLine();
		
		if(ispalindrome(str)) {
			System.out.println("Palindrome");
			
		}else {
			System.out.println("Not palindrome");
		}
		sc.close();
	}

}
