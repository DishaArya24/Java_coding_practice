package Strings;

import java.io.PrintStream;
import java.util.Scanner;

public class Remove_Vowels {
	public static String removeVowels(String str) {
		StringBuilder  result = new StringBuilder();
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			
			if (ch != 'a' && ch != 'e' && ch != 'i'
                    && ch != 'o' && ch != 'u'
                    && ch != 'A' && ch != 'E'
                    && ch != 'I' && ch != 'O'
                    && ch != 'U') {

                result.append(ch);
            }
		}
		return result.toString();
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter  a String: ");
		String str = sc.nextLine();
		System.out.println(removeVowels(str));
		sc.close();
	
	}

}
