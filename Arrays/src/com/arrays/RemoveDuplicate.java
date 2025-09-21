package com.arrays;

import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicate {
	public static void main(String[] args) {

		int a[] = { 10, 20, 30, 20, 40, 10 }; int target = 2;

		int b[] = removeDupEle(a);
		
		Arrays.sort(b);
		System.out.println(Arrays.toString(b));
		
		System.out.println(b[target-1]);//Find Nth smallest 
		
		System.out.println(b[b.length - target]);//Find Nth largest
		
	}
	public static int[] removeDupEle(int a[]) {
		
		HashSet<Integer> hs = new HashSet();
		for(int i = 0; i<=a.length-1; i++) {
			hs.add(a[i]);
		}
		int index = 0;
		int c[] = new int [hs.size()];
		for(int element : hs) {
			c[index] = element;
			index++;
		}
		return c;
	}
}
