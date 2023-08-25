package com.nissan.app;

import java.util.Scanner;

public class Question1 {

	
	public static void main(String[] args) {
		int x=0;
		int y=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number");
		x=sc.nextInt();
		System.out.println("Enter the second number");
		y=sc.nextInt();
		System.out.println("Before swapping:x="+x+"y="+y);
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("After swapping:x="+x+"y="+y);
		

		

	}

}
