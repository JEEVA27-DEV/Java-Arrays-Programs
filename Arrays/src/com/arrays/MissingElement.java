package com.arrays;

import java.util.Arrays;

public class MissingElement {

	public static void main(String[] args) {
		
		int a[] = {1,4,5,9};
		Arrays.sort(a);
//		int big = a[0]; int small = a[0];
//		for(int i = 0; i<a.length; i++) {
//			if(big < a[i])
//				big = a[i];
//			if(small > a[i])
//				small = a[i];
//		}
       // for(int i = small; i<= big; i++) {
		for(int i = a[0]+1; i<=a[a.length-1]-1;i++)	
			if(isMissing(i, a))
				System.out.println(i);
		}
	
	public static boolean isMissing(int n,int a[]) {
		
		for(int i = 0;i<a.length; i++) {
			if(a[i] == n)
				return false;
		}
		return true;
	}

}
