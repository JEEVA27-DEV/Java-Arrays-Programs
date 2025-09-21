package com.arrays;

public class FindMaxSumSubArray {
	
		public static void main(String[] args) {
		
		int a[] = {3,4-1,-7,4,8,-9,5};
		
		// recommended approach
		int MaximumNum = 0;	
		for(int i = 0 ; i <= a.length-1; i++) {	
			int max = 0;	
			for(int j = i; j<=a.length-1; j++) {
				max = max+a[j];
				
				if(max>MaximumNum)
					MaximumNum = max;
			}
		}
		System.out.println(MaximumNum);
		
		// second approach 
	 
//		for(int i = 0; i <= a.length-1; i++) {
//			for(int j = i; j<a.length-1; j++) {
//				FindMax(a,i,j);
//			}
//		}
//		System.out.println(Maxnum);
//	}
//	static int Maxnum = 0;
//	public static void FindMax(int a[],int start,int end) {
//		
//		int sum = 0;
//		for(int i = start; i<=end; i++) {
//			sum = sum +a[i];
//		}
//		if(sum>Maxnum)
//			Maxnum = sum;
	}
}













