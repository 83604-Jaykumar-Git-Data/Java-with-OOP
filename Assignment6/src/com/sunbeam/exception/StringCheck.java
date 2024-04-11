package com.sunbeam.exception;

import java.util.Scanner;

public class StringCheck {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String ");
		String name = sc.next();
		try {
		if(name.length()>20)
			throw new ExceptionLineTooLong("String too long");
		
		System.out.println("String is: "+name);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
