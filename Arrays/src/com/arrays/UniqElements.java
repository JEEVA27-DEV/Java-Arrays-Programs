package com.arrays;

public class UniqElements {
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
					if(count == 1)
					System.out.println(a[i] );
					
			}				
		}
	}		
}

//	public static void main(String[] args) {
//		
//		int a[] = {12,34,34,55,66,12,66};
//		
//		for(int i = 0 ; i <= a.length-1;i++) {
//			if(uniq(a[i],a))
//				System.out.println(a[i]);
//		}
// 	}
//	public static boolean uniq(int n,int a[]) {
//		
//		int count = 0;
//		
//		for(int i = 0; i<=a.length-1; i++) {
//			if(a[i] == n)
//				count++;
//		}
//		return count == 1;
//	}
//	
//}
