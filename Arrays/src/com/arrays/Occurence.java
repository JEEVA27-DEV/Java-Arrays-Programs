package com.arrays;

import java.util.Arrays;

public class Occurence {
	public static void main(String[] args) {
		
		int a[] = {10,20,30,40,10,20,30,50,60};
		
		boolean b[] = new boolean[a.length];
		
		for(int i = 0; i<=a.length-1; i++) {
			if(b[i] == false) 
			{
				int count = 1;
				for(int j = i+1; j<=a.length-1; j++) {
					if(a[i] == a[j]) {
						count++;
						b[j] = true;
					}
				}
				System.out.println(a[i] +" ---> "+count);
				
			}
			
		}
	}
	
}
// 2nd approach
//	public static void main(String[] args) {
//		
//		int a[] = {10,20,30,20,10};
//		
//		for(int i = 0; i<=a.length-1; i++) {
//			
//			int b =  occurence(a[i],a,i);
//		     if(b != 0)
//				System.out.println(a[i]+" --> "+b);
//			
//		}
//		
//	}
//	public static int occurence(int n,int a[],int index) {
//		
//		int count = 0 ;
//		for(int i =0; i<= a.length-1; i++) {
//			if(a[i] == n)
//				count++;
//			}
//		for(int i = 0; i<index; i++) {
//			if(a[i] == n)
//				return 0;
//		}
//		return count;
//	}
//
//}
