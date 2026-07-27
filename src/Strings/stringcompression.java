package Strings;

import java.util.Scanner;

public class stringcompression {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String name = sc.next();
		
		StringBuilder result = new StringBuilder();
		int count = 1;
		
		for(int i = 0;i<name.length();i++) {
			if(i<name.length ()-1 && name.charAt(i) == name.charAt(i+1)) {
				count++;
			}else {
				result.append(name.charAt(i));
				result.append(count);
				count =1;
			}
		}
		System.out.println(result.toString());
		
	}

}
