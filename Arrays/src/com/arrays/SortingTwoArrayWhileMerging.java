package com.arrays;

import java.util.Arrays;

public class SortingTwoArrayWhileMerging {

	public static void main(String[] args) {

		int a[] = {10,20,30};
		int b[] = {100,200,300,400};
		
		int c[] = MergeAndSort(a,b);
		System.out.println(Arrays.toString(c));
	}
	public static int[] MergeAndSort(int a[], int b[]) {
		
		int c[] = new int[a.length+b.length];
		
		int i =0, j=0, k=0;
		while(i<a.length && j <b.length ) {	
			if(a[i]<b[i]) {
			c[k++] = a[i++];
			}else
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
