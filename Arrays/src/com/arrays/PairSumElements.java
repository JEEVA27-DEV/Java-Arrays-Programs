package com.arrays;

public class PairSumElements {

	public static void main(String[] args) {
		
		int a[] = {1,2,3,8,6,4,0,5,3,6,3};
		
		int target = 8;
		
		for(int i = 0; i<=a.length-1; i++) {
			for(int j = i+1; j <=a.length-1; j++) {
				
				if(a[i] + a[j] == target)
					System.out.println(a[i]+" + "+a[j] +" = "+target);
			}
		}
	}
}
