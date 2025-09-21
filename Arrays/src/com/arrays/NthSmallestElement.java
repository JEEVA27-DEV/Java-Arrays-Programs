package com.arrays;

import java.util.Arrays;

public class NthSmallestElement {
	public static void main(String[] args) {
		
		int a[] = {50,10,40,60,20,90,20};
		
		int target = 2;
		
		for(int i = 0;i<=a.length-1; i++) {
			for(int j =i+1; j<=a.length-1; j++ ) {
				if(a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
	    }
		System.out.println(target + " Smallest Element is : "+a[target-1]);
    }
}
