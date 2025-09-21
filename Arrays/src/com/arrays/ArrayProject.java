package com.arrays;

import java.util.Scanner;

public class ArrayProject {

	static int stack [];
	static int top;
	
	static void createStack(int size) {
		stack = new int[size];
		top = -1;
		
		System.out.println("Stack created successfully with size "+size);
	}
	static void push(int ele) {
		
		if(top == stack.length-1) {
			System.err.println("Stack is full");
		}else {
			top++;
			stack[top] = ele;
		
		System.out.println(ele+" element added sucessfully");
		}
	}
	static void pop() {
		if(top == -1) {
			System.err.println("Stack is empty");
		}
		else {
			
			int ele =stack[top] ;
			top--;
		System.out.println(ele+" element deleted succefully");
		}
	}
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the stack size to create : ");
		int size = sc.nextInt();
		
		createStack(size);
		
		while(true) {
			System.out.println("Press Enter 1 to insert\nPress Enter 2 to delete\n"
					+ "Press Enter 3 to exit");
			System.out.println("Enter your options here :");
			
			int option = sc.nextInt();
			
			switch(option) {
			case 1 : 
				System.out.println("Enter a element to insert");
				int ele = sc.nextInt();
				push(ele);
				break;
			case 2 :
				pop();
				break;
			case 3 :
				System.out.println(" ----- THANK YOU ----- ");
				System.exit(0);
				//return;
				default :
					System.out.println("Please enter valid option");
			}
		}
		
	}

}
