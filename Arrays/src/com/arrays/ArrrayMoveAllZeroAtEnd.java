package com.arrays;

import java.util.Arrays;

public class ArrrayMoveAllZeroAtEnd {

	public static void main(String[] args) {
		
		int a[] = {5,2,0,10,4,0,3,0,1};
		
		int index = 0;
		for(int i = 0; i<=a.length-1; i++) {
			if(a[i] != 0) {
				a[index] = a[i];
				index++;
			}
		}
		for(int i = index; i<a.length; i++) {
			a[index] = 0;
			index++;
		}
		System.out.println(Arrays.toString(a));
	}
}
