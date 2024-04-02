//2. Accept 2 double values from User (using Scanner). Check data type. If arguments are not
//doubles, supply suitable error message & terminate.
//If numbers are double values, print its average.
//Hint : Check Scanner class for the methods

import java.util.Scanner;

class Q2 {

	public static void main(String[] args) {
		
		double num1 = 0,num2=0,ans;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter num1: ");
        if (sc.hasNextDouble()) {
        	if(sc.hasNextInt()) {
        		System.out.println("Enter number is not a double");
        	}
        	else {
        		num1 = sc.nextDouble();
        		System.out.println("Enter num2: ");
            	if(sc.hasNextDouble()) {
            		if(sc.hasNextInt()) {
            			System.out.println("Enter number is not a double");
            		}
            		else {
            			num2 = sc.nextDouble();
            			System.out.println("Avg " + ((num1+num2)/2));
            		}
        	}
        }
//        else {
//        	System.out.println("Enter num2: ");
//        	if(sc.hasNextDouble()) {
//        		if(sc.hasNextInt()) {
//        			System.out.println("Enter number is not a double");
//        		}
//        		else {
//        			num2 = sc.nextDouble();
//        			System.out.println("Avg " + ((num1+num2)/2));
//        		}
//        	}
//        }
//            double num1 = sc.nextDouble();

            // Get second number
//            System.out.print("Enter the second double value: ");
//            if (sc.hasNextDouble()) {
//                double num2 = sc.nextDouble();
//
//                // Calculate and print average
//                double average = (num1 + num2) / 2;
//                System.out.print("The average is: " + average);
//            } else {
//                System.out.print("Error: Second input is not a double value.");
//            }
//        } else {
//            System.out.print("Error: First input is not a double value.");		
	}
}
}