package com.arrays;

import java.util.Arrays;

public class RotateArray2 {

	public static void main(String[] args) {
		
		int a[] = {10,20,30,40,50};
		
		int k =2;
		
		int b[] = new int[a.length];
		
		for(int i = k; i<=a.length-1; i++) {
			b[i-k] = a[i];
		}
		for(int i = 0;i<k; i++) {
			b[a.length-k+i] = a[i];
		}
		System.out.println(Arrays.toString(b));
		
	}
}
