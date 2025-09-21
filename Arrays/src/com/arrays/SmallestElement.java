package com.arrays;

public class SmallestElement {

	public static void main(String[] args) {
		
		int a[] = {32,4,7,5,9};
		int small = a[0];
		for(int num = 0;num<=a.length-1;num++) {
			if(small > a[num])
				small=a[num];
		}
		System.out.println(small);
	}
}