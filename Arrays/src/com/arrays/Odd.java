package com.arrays;

public class Odd {

	public static void main(String[] args) {
		
		int a[] = {32,4,5,9,21};
		int sum = 0;
		for(int num : a) {
			if(num % 2 != 0) 
				sum+=num;
		}
		System.out.println(sum);
	}

}
