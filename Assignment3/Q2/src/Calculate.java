//Q2. Create an application that calculates your daily driving cost, so that you can estimate how much
//money could be saved by car pooling, which also has other advantages such as reducing carbon
//emissions and reducing traffic congestion. The application should input the following information
//and display the user’s cost per day of driving to work:
//a) Total miles driven per day.
//b) Cost per gallon of gasoline.
//c) Average miles per gallon.
//d) Parking fees per day.
//e) Tolls per day.

import java.util.Scanner;

public class Calculate {
	private double totalMiles;
	private double gasolinePrice;
	private double carAvg;
	private double parkFees;
	private double tollFees;
	private double total=0;
	
	public void accept() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Total Miles: ");
		totalMiles = sc.nextDouble();
		System.out.println("Enter Gasoline Price: ");
		gasolinePrice = sc.nextDouble();
		System.out.println("Enter Car Average: ");
		carAvg = sc.nextDouble();
		System.out.println("Enter Park Fees: ");
		parkFees = sc.nextDouble();
		System.out.println("Enter Toll Fees: ");
		tollFees = sc.nextDouble();
	}
	
	public void display() {
//		System.out.println("cost per day of driving to work: "+((totalMiles/carAvg)*gasolinePrice)+parkFees+tollFees);
		total = ((totalMiles/carAvg)*gasolinePrice)+parkFees+tollFees;
		System.out.println("Total cost "+total);
	}
	
	public static void main(String[] args) {
		Calculate c1 = new Calculate();
		
		c1.accept();
		c1.display();
	}

}