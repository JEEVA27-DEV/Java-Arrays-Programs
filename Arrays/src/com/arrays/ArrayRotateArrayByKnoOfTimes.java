package com.arrays;

import java.util.Arrays;

public class ArrayRotateArrayByKnoOfTimes {

	public static void main(String[] args) {
		
		int a[] = {1,2,3,4,5};
		int k = 2;
//		for(int j = 1; j<=k; j++) {
//		int temp = a[0];
//		for(int i = 1; i<=a.length-1; i++) {
//			a[i-1] = a[i];
//		}
//		a[a.length-1] = temp;
//		}
//		System.out.println(Arrays.toString(a));
		
		//2nd approach
		int temp[] = new int [a.length];
		
		for(int i = k; i<=a.length-1; i++) {
			temp[i-k] = a[i];
		}
		for(int i = 0; i<k; i++) {
			temp[a.length-k+i] = a[i];
		}
		System.out.println(Arrays.toString(temp));
	}
}
