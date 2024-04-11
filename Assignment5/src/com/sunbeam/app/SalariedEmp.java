package com.sunbeam.app;

import java.util.Scanner;

public class SalariedEmp extends Employee {
	private double weeklySalary;
	
	@Override
	public void acceptEmployee(Scanner sc) {
		// TODO Auto-generated method stub
		super.acceptEmployee(sc);
		System.out.println("Enter weekly Salary");
		weeklySalary = sc.nextDouble();
	}

	@Override
	public void calculateSalary() {
		System.out.println("Weekly salary "+weeklySalary);
	}
	
	public String toString() {
		return "Salaried Employee " + super.toString() + "Weekly Salary "+weeklySalary;
	}

}
