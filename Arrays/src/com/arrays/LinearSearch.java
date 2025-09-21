package com.arrays;

public class LinearSearch {

	public static void main(String[] args) {

		int a[] = {23,4,65,7,10};
		int target = 7;
		
	    int index = linearSearch(a,target);
	    System.out.println(index==-1 ? "Target not found" :"Target found");
	}
	public static  int linearSearch(int a[],int target) {
		
		for(int i = 0; i< a.length; i++) {
			
			if(target == a[i])
				return i;
		}
		return -1;
	}

}
