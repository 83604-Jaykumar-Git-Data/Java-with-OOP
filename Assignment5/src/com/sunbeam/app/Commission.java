package com.sunbeam.app;

import java.util.Scanner;

public class Commission extends Employee {
	private double grossSales;
	private double commissionRate;
	
	
	@Override
	public void acceptEmployee(Scanner sc) {
		// TODO Auto-generated method stub
		super.acceptEmployee(sc);
		System.out.println("Enter gross sales");
		grossSales = sc.nextDouble();
		System.out.println("Enter commission rate");
		commissionRate = sc.nextDouble();
	}
	
	public double getGrossSales() {
		return grossSales;
	}

	public void setGrossSales(double grossSales) {
		this.grossSales = grossSales;
	}

	public double getCommissionRate() {
		return commissionRate;
	}

	public void setCommissionRate(double commissionRate) {
		this.commissionRate = commissionRate;
	}

	@Override
	public void calculateSalary() {
		System.out.println("commission Salary" + (commissionRate*grossSales));
		
	}
	
	@Override
	public String toString() {
		return "Commission Employee" + super.toString() + "Gross Sales " + grossSales + "Commission " + commissionRate;
	}
	
}
