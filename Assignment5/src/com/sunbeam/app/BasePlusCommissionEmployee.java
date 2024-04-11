package com.sunbeam.app;

import java.util.Scanner;

public class BasePlusCommissionEmployee extends Commission {
	private double baseSalary;
	
	@Override
	public void acceptEmployee(Scanner sc) {
		super.acceptEmployee(sc);
		System.out.println("Enter base salary: ");
		baseSalary = sc.nextDouble();
	}
	
	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}

	@Override
	public void calculateSalary() {
		System.out.println("total salary is: " + ((getCommissionRate() * getGrossSales() )+baseSalary));
	}

	@Override
	public String toString() {
		return "BasePlusCommissionEmployee " + super.toString() + "baseSalary " + baseSalary;
	}	
}
