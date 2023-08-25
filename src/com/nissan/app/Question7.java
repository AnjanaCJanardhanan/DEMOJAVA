package com.nissan.app;

import java.util.Scanner;

public class Question7 {

	
	public static void main(String[] args) {
	float f;
	float c;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the temperature in fahreheit:");
	f=sc.nextFloat();
	c=((f-32)*5)/9;
	System.out.println("Temperature in celsius="+c);

	}

}
