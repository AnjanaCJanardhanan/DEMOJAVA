package com.nissan.app;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		int a,b=0;
		int q,r;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the first number:");
		a=sc.nextInt();
		System.out.println("Enter the second number:");
		b=sc.nextInt();
		q=a/b;
		r=a%b;
		System.out.println("quotient:"+q);
		System.out.println("remainder:"+r);
		
	}

}
