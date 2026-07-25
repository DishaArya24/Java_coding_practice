package Strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class NonRepeatingcharacter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String str = sc.nextLine();
        
        Map<Character,Integer> freq = new HashMap<>();
        
        //counting frequency of each character
        for(int i=0;i<str.length();i++) {
        	char ch = str.charAt(i);
        	freq.put(ch, freq.getOrDefault(ch, 0)+1);
        }
        
        //character with frequency one
        boolean found = false;
        for(int i=0;i<str.length();i++) {
        	char ch = str.charAt(i);
        	if(freq.get(ch)==1) {
        		System.out.println("First non-repeating char:"+ch);
        		found =true;
        		break;
        		
        	}
        }
        if(!found) {
        	System.out.println("No non-repeating character found.");
        }
        sc.close();
	}

}
