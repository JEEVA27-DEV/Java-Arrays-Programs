package com.arrays;

import java.util.Arrays;

public class MergeTwoArrayZigZag {
	
	public static void main(String[] args) {
		
		int a[] = {10,20,30,50};
		int b[] = {40,80,90};
		
		int c[] = ZigZag(a,b);
		System.out.println(Arrays.toString(c));
		
	}
	public static int[] ZigZag(int a[],int b[] ) {
		
		int c[] = new int[a.length + b.length];
		
		int i = 0, j=0, k=0;
		
		while(i<a.length && j<b.length) {
			c[k++] = a[i++];
			c[k++] = b[j++];
		}
		while(i<a.length) {
			c[k++] = a[i++];
		}
		while(j<b.length) {
			c[k++] = b[j++];
		}
		return c;
	}
}
















