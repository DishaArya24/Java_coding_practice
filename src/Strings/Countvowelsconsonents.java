package Strings;

import java.util.Scanner;

public class Countvowelsconsonents {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String name = sc.nextLine();
		name = name.toLowerCase();
		int vowels = 0;
		int consonants = 0;
		
		for(int i=0;i<name.length();i++) {
			char ch = name.charAt(i);
			if(ch>='a'&&ch<='z') {
				if(ch =='a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
					vowels ++;
					
				}else {
					consonants++;
				}
			}
		}
		System.out.println("Vowels = " + vowels);
		System.out.println("Consonants = " + consonants);
		sc.close();
	}

}
