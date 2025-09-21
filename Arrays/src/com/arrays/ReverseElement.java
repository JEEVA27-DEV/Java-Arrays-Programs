package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseElement {

	public static void main(String[] args) {
		
		int a[] = {3,7,5,6,9};
		
		a = reverse(a);
		System.out.println(Arrays.toString(a));
	}
	public static int[] reverse(int a[]) {
		
		int i = 0, j = a.length-1;
		
		while(i<j) {
			
			int temp = a[i];
			a[i] = a[j];
			a[j] = temp;
			i++;j--;
		}
		return a;
	}
}
