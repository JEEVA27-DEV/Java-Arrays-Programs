package com.arrays;

public class CountPalindrome {

	public static void main(String[] args) {
		
		int a[] = {121,55,4,2,34,343};
		int count = 0;
		for(int i = 0; i<=a.length-1; i++) {
			
			if(ispalindrome(a[i])) 
				count++;
		}
		System.out.println(count);
	}
	public static boolean ispalindrome(int a) {
		
		int original_num = a , reverse = 0;
		
		while(a>0){
			reverse=reverse * 10 + a%10;
			a = a/10;
		}
		return original_num == reverse;
	}
}
