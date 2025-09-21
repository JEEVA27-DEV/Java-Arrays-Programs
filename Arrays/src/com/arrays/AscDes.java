package com.arrays;

import java.util.Arrays;

public class AscDes {

	public static void main(String[] args) {
		
		int a[] = {12,34,5,6,74,34};
		  
		Arrays.sort(a);
		int n = a.length;
		int mid = n/2;
		
		int i = mid , j= n-1;
		while(i<j) {
			int temp = a[i];
			a[i] = a[j];
			a[j] = temp;
			i++;j--;
		}
	
		System.out.println(Arrays.toString(a));

	}
}
