package com.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

public class RemoveDupEleUsingCollection {

	public static void main(String[] args) {
		
		int a[] = {10,20,30,30,20,10,40,50}; int n = 2;
		
		TreeSet<Integer> hs = new TreeSet<Integer> ();
		
		for(int i = 0; i<=a.length-1; i++) {
			
			hs.add(a[i]);
		}
		ArrayList<Integer> a1 = new ArrayList<>(hs);
		System.out.println(n+" smallest element is "+a1.get(n-1));
		System.out.println(n+" largest element is "+a1.get(a1.size()-n));
		
	}
}
