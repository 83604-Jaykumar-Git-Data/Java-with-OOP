package com.app.tester;

import com.app.geometry.Point2D;

public class TestPoint {

	public static void main(String[] args) {
		boolean result;
		// TODO Auto-generated method stub
		Point2D p1 = new Point2D();
		p1.acceptPoint();
		p1.displayPoint();
		
		
		Point2D p2 = new Point2D();
		p2.acceptPoint();
		p2.displayPoint();
		
		result = p1.isEqual(p2);
		
		if(p1.isEqual(p2))
		{
			p1.getDetails();
			System.out.println("Point p1 is equal to p2");
		}
		else {
			p1.getDetails();
			p2.getDetails();
			p1.calculateDistance(p2);
		}
		
		
//		System.out.println(p1.getDetails());
//		System.out.println(p2.getDetails());
		
//		p2.getDetails();

	}

}
