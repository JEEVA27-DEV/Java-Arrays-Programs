package com.arrays;

import java.util.Arrays;

public class ReplaceSum {

	public static void main(String[] args) {
		
		int a[] = {23,45,66,99,12};
		
		for(int i = 0; i< a.length; i++) {
			
			a[i] = sum(a[i]);
	
		}
		System.out.println(Arrays.toString(a));
	}
	public static int sum(int a){
		
		int sum =0 ;
	 
		while(a>0) {
			sum = sum + a%10;
			a = a/10;
		}
		return sum;
	}

}
