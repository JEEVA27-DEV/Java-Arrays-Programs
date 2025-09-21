package com.arrays;

import java.util.Arrays;

public class MoveZeros {
	public static void main(String[] args) {
		
		int a[] = {10,30,0,5,0,6,50,0};
		
		System.out.println("-------Before sorting------- ");
		System.out.println(Arrays.toString(a));
		
		int index = 0;
		for(int i = 0; i<= a.length-1; i++) {
			
			if(a[i] != 0) {
				a[index] = a[i];
				index++;
			}
			
			
		}
		for(int i = index; i<=a.length-1; i++) {
			a[index] = 0;
			index++;
		}
		System.out.println("-------After sorting--------");
		System.out.println(Arrays.toString(a));
	}
}
