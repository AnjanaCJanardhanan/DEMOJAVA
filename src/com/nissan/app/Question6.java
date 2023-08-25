package com.nissan.app;

import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {
		float d;
		float m,i,f,cm;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the distance betweem two cities in kilometers");
		d=sc.nextFloat();
		m=d*1000;
		cm=m*100;
		i=cm/2.54f;
		f=i/12;
		System.out.println("Distance in meter="+m+"cm="+cm+"inch="+i+"feet="+f);
		
	}

}
