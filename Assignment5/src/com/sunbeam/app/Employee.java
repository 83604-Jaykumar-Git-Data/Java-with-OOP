package com.sunbeam.app;

import java.util.Scanner;

public abstract class Employee implements Acceptable {
	private String firstName;
	private String lastName;
	private String SSN;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getSSN() {
		return SSN;
	}
	public void setSSN(String sSN) {
		SSN = sSN;
	}
	
	public void acceptEmployee(Scanner sc) {
		System.out.println("Enter First name");
		firstName = sc.next();
		System.out.println("Enter Last name");
		lastName = sc.next();
		System.out.println("Enter SSN");
		SSN = sc.next();
	}
	
	public abstract void calculateSalary();
	
	public String toString() {
		return "Firstname "+firstName + "Last name " + lastName + "SSN " + SSN;
	}
}
