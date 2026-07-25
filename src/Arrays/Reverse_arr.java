package Arrays;

import java.util.Arrays;

public class Reverse_arr {
	/*
	 * write a program to reverse an array
	 */
	public static void main(String[] args) {
	    int[] a = {10,20,30,40,50,60,70,80,90,100};
	    System.out.println(Arrays.toString(a));
	    
	    for(int i=0;i<a.length/2;i++) {
	    	a[i] = a[i]+a[a.length-1-i];
	    	a[a.length-i-1]=a[i]-a[a.length-i-1];
	    	a[i] = a[i]-a[a.length-i-1];
	    }
	    System.out.println(Arrays.toString(a));
	    
	}

}
