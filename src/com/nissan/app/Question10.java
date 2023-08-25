package com.nissan.app;

import java.util.Scanner;

public class Question10 {

	public static void main(String[] args) {
		int a;
		int s=0;
		int r;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a five digit number:");
		a=sc.nextInt();
		while(a>0)
		{
			r=a%10;
			s=s+r;
			a=a/10;
		}
		System.out.println("Sum of digits="+s);
	}

}
