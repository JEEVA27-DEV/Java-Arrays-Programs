package com.arrays;

public class MostRepeatedElement {

	public static void main(String[] args) {
		
		int a[] = {10,20,30,40,20,20,10,20,30,50,10,60};
		
		int mostcount = 0;
		int mostrepeated  = a[0];
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
				if (count > mostcount) {
					mostcount = count;
					mostrepeated = a[i];
				}	
		     }				
		}
		System.out.println(mostrepeated);
	}		
}
