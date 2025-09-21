package com.arrays;

public class NthUniqElement {

	public static void main(String[] args) {
		
		int a[] = {10,20,30,40,10,20,30,50,60};
		
		boolean b[] = new boolean[a.length];
		
		int num = 3;
		
		int Nthcount = 0;
		
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
				if(count == 1) {
					Nthcount++;
					if(Nthcount == num )
						System.out.println(a[i] );
				}
				
		}				
	}
}		
}
