package com.nissan.app;

import java.util.Scanner;

public class strings_q2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter character");
		char s=sc.next().charAt(0);
		if(s=='a'||s=='e'||s=='i'||s=='o'||s=='u')
			System.out.println("Character is a vowel");
		else
			System.out.println("Consonant");

	}

}
