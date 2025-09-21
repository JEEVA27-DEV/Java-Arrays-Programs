package com.arrays;

import java.util.Arrays;

public class Duplicate {
	
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
				if(count > 1)
				System.out.println(a[i] );
				
		}				
	}
}		

}

//	public static void main(String[] args) {
//		
//		int a[] = {10,20,30,20,10};
//		
//		for(int i = 0; i<=a.length-1; i++) {
//			
//			if(duplicate(a[i],a,i))
//				System.out.println(a[i]);	
//		}
//		
//	}
//	public static boolean duplicate(int n,int a[],int index) {
//		
//		int count = 0 ;
//		for(int i =0; i<= a.length-1; i++) {
//			if(a[i] == n)
//				count++;
//		}
//		if(count > 1) {
//			for(int i = 0; i< index; i++) {
//				if(a[i] == n)
//					return false;
//			}
//			return true;
//		}
//		return false;
//	}
//
//}
