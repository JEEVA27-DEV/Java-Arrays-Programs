package com.arrays;

import java.util.Arrays;

public class Prime {

	public static void main(String[] args) {
		
		int a[] = {23,45,7,5,12};
		
		for(int i = 0;i<=a.length-1; i++) {
		 
			if(isprime(a[i])) 
				System.out.println(a[i]);
		}
		
	}

	public static boolean isprime(int a) {
		if(a<2)
			return false;
		for(int i = 2; i<=a/2;i++) {
			if(a % i == 0)
				return false;
		}
		return true;
	}
}
