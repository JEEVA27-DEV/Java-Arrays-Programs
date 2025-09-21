package com.arrays;

public class TwoDimensionalArray3 {

	public static void main(String[] args) {
//prime
		int a[][] = {{4,7,2},{33,66,46},{23,64,7}};
		
		for(int i = 0; i<=a.length-1; i++) {
			for(int j = 0; j<=a[i].length-1 ; j++) {
				
				if(isprime(a[i][j]))
					System.out.println(a[i][j]);
			}
		}
	}
	public static boolean isprime(int a) {
		if(a<=1) {
			return false;
		}
		for(int i =2 ; i<=a/2; i++) {
			if(a%i==0)
				return false;
		}
		return true;
	}

}
