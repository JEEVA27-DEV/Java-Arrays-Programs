package com.arrays;

import java.util.Arrays;

public class NthBiggestElement {
	public static void main(String[] args) {
		
		int a[] = {50,10,40,60,20,90,20}; int target = 1;
		int count = 0;
		for(int i = 0 ; i<=a.length-1; i++) {
			a = FindBig(a,target);
			count++;
			if(target == count) {
				System.out.println(a[i]);
			}
		}
	}
	public static int[] FindBig(int a[],int target) {
		
		for(int i = 0;i<=a.length-1; i++) {
			for(int j =i+1; j<=a.length-1; j++ ) {
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
