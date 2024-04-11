package com.sunbeam.app;

import java.util.Scanner;

public class HourlyEmp extends Employee{
	private  double hourlyWage;
	private double hoursWorked;
	
	@Override
	public void acceptEmployee(Scanner sc) {
		// TODO Auto-generated method stub
		super.acceptEmployee(sc);
		System.out.println("Enter Hourly wage");
		hourlyWage = sc.nextDouble();
		System.out.println("Hours worked");
		hoursWorked = sc.nextDouble();
	}
	
	@Override
	public void calculateSalary() {
		double sal=0;
		if(hoursWorked<=40) {
			sal = hourlyWage * hoursWorked;
		}
		else if(hoursWorked > 40) {
			sal = ((40*hourlyWage+hoursWorked) + (hoursWorked - 40 * hourlyWage*1.5));
		}
		System.out.println("Hourly salary / Total Salary) :"+sal);

		
	}
	
	@Override
	public String toString() {
		return "Hourly Employee" + super.toString() + "Hourly wages " + hourlyWage + "Hours Worked" + hoursWorked;
	}
}
