package com.arrays;

import java.util.Arrays;

public class MergeArray {

	public static void main(String[] args) {
		
		int a[] = {32,56,7,3};
		int b[] = {3,56,7,9,2,3,4};
		
		int c[] =merge(a,b);
		System.out.println(Arrays.toString(c));
	}
	public static int[] merge(int a[],int b[]) {
		
		int c[] = new int[a.length + b.length];
	
		for(int i = 0; i<a.length; i++) {
			c[i] = a[i];
		}
		for(int i = 0; i<b.length;i++)
			c[a.length + i] = b[i];
		return c;
	}
}
