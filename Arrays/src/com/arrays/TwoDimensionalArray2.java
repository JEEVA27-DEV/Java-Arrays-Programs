package com.arrays;

public class TwoDimensionalArray2 {

	public static void main(String[] args) {

		int a[][] = {{10,20,30},{40,50,60},{70,80,90}};
		
		int primary_sum = 0, secondary_sum=0;
		for(int i =0; i<a.length; i++) {
			for( int j = 0; j<a[i].length; j++) {
				if(i==j) {
					primary_sum += a[i][j];
				}
				if(i+j==a.length-1)
					secondary_sum += a[i][j]; 
			}
			
		}
		System.out.println("primary sum is "+primary_sum);
		System.out.println("Secondary sum is "+secondary_sum);
		
	}

}
