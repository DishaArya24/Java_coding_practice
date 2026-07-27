package Strings;

import java.util.Scanner;

public class romanInteger {
	public static int romanint(String s) {
		int sum = 0;
		for(int i=0;i<s.length();i++) {
			int current = valueOf(s.charAt(i));
			
			if(i<s.length()-1) {
				int next = valueOf(s.charAt(i+1));
				
				if(current<next) {
					sum = sum-current;
				}else {
					sum = sum + current;
				}
			}else {
				sum = sum+current;
			}
		}
			return sum;
		}
		
		public static int valueOf(char ch) {
			switch (ch) {
			case 'I': return 1;
			case 'V' : return 5;
			case 'X' : return 10;
			case 'L' : return 50;
			case 'C' : return 100;
			case 'D' : return 500;
			case 'M' :return 1000;
			default: return 0;
			}
		}
		
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		String s = sc.next();
		System.out.println(romanint(s));
		sc.close();
		
	}

}
