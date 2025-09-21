package com.arrays;

import java.util.Arrays;

public class SortDesc {
	
	public static void main(String[] args) {
		
		int a[] = {10,50,23,55,67,5};
		
		a = sort(a);
		
		System.out.println(Arrays.toString(a));
	}
	public static int[] sort(int a[]) {
		
		for(int i = 0; i<=a.length-1; i++) {
			
			for(int j = i+1; j<=a.length-1; j++) {
				
				if(a[i] < a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		return a;
	}

}
