//Q1. Copy the Point2D class , along with the package from previous assignment.
//a) Create a class "TestPointArray1.java" in "tester" package for the following
//b) Accept , how many no of points to plot from user.
//c) Create suitable data structure
//Hint : Point2D[] points=new Point2D[sc.nextInt()];
//d) Prompt user for x & y co ordinates n store the data suitably
//Hint : for loop
package tester;

import java.util.Scanner;

import com.app.point.Point2D;

public class TestPointArray1 {

	public static void main(String[] args) {
		
		int p;
		int choice;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("No of points to plot: ");
//		p = sc.nextInt();
		Point2D[] points=new Point2D[sc.nextInt()];
		
		for(int i=0;i<points.length;i++) {
			points[i] = new Point2D();
			points[i].acceptPoint();
		}
		
		do {
			System.out.println("1. Display details of a specific point");
			System.out.println("2. Display x, y co-ordinates of all points");
			System.out.println("3. Display distance between specified points");
			System.out.println("4. Exit");
			choice = sc.nextInt();
			
			switch(choice) {
			case 1:
			{
				System.out.println("enter index to get details of a specific point");
				int index = sc.nextInt();
				if(index>points.length) {
					System.out.println("Enter coorect option!!!!!");
				}
				else {
					System.out.println("Details: "+points[index-1].getDetails());
				}
//			}
				break;
			}
			case 2:
				System.out.println("All Points are: ");
				for(Point2D poi: points) {
					System.out.println(poi.getDetails());
				}
			case 3:
				System.out.println("Enter index to compare: ");
				int index = sc.nextInt();
//				if(index> points.length || index<points.length) {
				if(index> points.length) {

					System.out.println("enter valid index no.");
				}
				else {
					System.out.println("enter 2nd index to compare with");
					int index2 = sc.nextInt();
//					if(index2>points.length || index<points.length) {
						if(index2>points.length) {
					}
						if(index2>points.length ) {
						System.out.println("Enter valid index no.");
					}
					else {
						if(points[index-1].equals(points[index2-1])) {
							System.out.println(points[index].getDetails());
							System.out.println("Point p1 and p2 are same");
						}
						else {
							points[index-1].calculateDistance(points[index2-1]);
						}
					}
				}
				break;
			case 4:
				System.out.println("Exit");
				break;
			default:
				System.out.println("Enter correct choice: ");
			}
			
		}while(choice!=0);		
}

}
