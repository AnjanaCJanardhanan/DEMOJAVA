package com.nissan.app;

import java.util.Scanner;

public class strings_q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner (System.in);
		String str=s.nextLine();
		System.out.println("Enter string: ");
		String result=str.replace(".#.|#.", "");
		System.out.println("Modifies string: "+result);

	}

}
