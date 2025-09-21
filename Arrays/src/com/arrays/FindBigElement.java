package com.arrays;

public class FindBigElement {

	public static void main(String[] args) {
		
		int a[] = {32,4,7,5,9};
		int big = a[0];
		for(int num = 0;num<=a.length-1;num++) {
			if(big < a[num])
				big=a[num];
		}
		System.out.println(big);
	}
}
