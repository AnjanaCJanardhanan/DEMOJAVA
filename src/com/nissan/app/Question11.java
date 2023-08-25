package com.nissan.app;

import java.util.Scanner;

public class Question11 {

	public static void main(String[] args) {
		int n;
		int r;
		int rev=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a five digit number");
		n=sc.nextInt();
		while(n>0)
		{
			r=n%10;
			rev=rev*10+r;
			n=n/10;
		}
		System.out.println("Reverse:"+rev);
	}

}
