package com.arrays;

import java.util.Arrays;
import java.util.HashSet;

public class MergeTwoSortArray {

	public static void main(String[] args) {
		
		int a[] = {10,20,30,50};
		int b[] = {50,80,90};
		
		int c[] = MergeArray(a,b);
		System.out.println(Arrays.toString(c));
	}
	public static int[] MergeArray(int a[], int b[]) {
		
		HashSet<Integer> hs = new HashSet<Integer>();
		
		for(int i = 0; i<=a.length-1; i++) {
			hs.add(a[i]);
		}
		for(int j = 0; j<=b.length-1; j++) {
			hs.add(b[j]);
		}
		int c[] = new int [hs.size()];
		
		int index =0 ;
		for(int ele : hs) {
			c[index] = ele;
			index++;
		}
		Arrays.sort(c);

		return c;
	}
}
