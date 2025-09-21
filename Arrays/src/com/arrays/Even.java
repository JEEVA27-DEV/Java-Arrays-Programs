package com.arrays;

import java.util.Arrays;

public class Even{
	public static void main(String[] args) {
		
		int n[] = {2,3,4,7,9,6};
		
		for(int i = 0; i<=n.length-1; i++) {
			
			if(n[i] % 2 == 0)
				System.out.println(n[i]);
		}
	}
}
