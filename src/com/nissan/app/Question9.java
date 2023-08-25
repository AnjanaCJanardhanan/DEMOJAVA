package com.nissan.app;

import java.util.Scanner;

public class Question9 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		float sal;
		float da,hra;
		System.out.println("Enter the basic salary");
		sal=sc.nextFloat();
		da=(float) (0.4 * sal);
		hra=(float) (0.2 * sal);
		System.out.println("DA:"+da);
		System.out.println("HRA:"+hra);
		System.out.println("Total Salary="+(sal+da+hra));

	}

}
