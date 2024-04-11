package com.sunbeam.app;

import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("1. Salried employee");
		System.out.println("2. Hourly employee");
		System.out.println("3. Commision employee");
		System.out.println("4. Base + Commision employee");
		System.out.println(" Enter your choice");
		int ch = sc.nextInt();

		if (ch == 1) {
			Employee e = new SalariedEmp();
			e.acceptEmployee(sc);
			e.toString();
			e.calculateSalary();
		}
		else if (ch == 2) {
			Employee e = new HourlyEmp();
			e.acceptEmployee(sc);
			e.toString();
			e.calculateSalary();
		}
		else if (ch == 3) {
			Employee e = new Commission();
			e.acceptEmployee(sc);
			e.toString();
			e.calculateSalary();
		}
		else if (ch == 4) {
			Employee e = new BasePlusCommissionEmployee();
			e.acceptEmployee(sc);
			e.toString();
			e.calculateSalary();

			BasePlusCommissionEmployee b = (BasePlusCommissionEmployee) e;

			System.out.println("After the Reward : "
					+ ((b.getBaseSalary() + (b.getCommissionRate() * b.getGrossSales())) * 1.10));
		} 
		else {
			System.out.println("enter valid choice ");
		}

	}

}

