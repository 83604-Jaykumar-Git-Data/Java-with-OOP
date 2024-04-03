package com.app.geometry;

import java.util.Scanner;

public class Point2D {
	private int xaxis;
	private int yaxis;
	
	
	public Point2D() {
		
	}

	public Point2D(int xcoordinate, int ycoordinate) {
		this.xaxis = xcoordinate;
		this.yaxis = ycoordinate;
	}
	public void acceptPoint()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter x-coordinate: ");
		xaxis=sc.nextInt();
		System.out.println("Enter y-coordinate: ");
		yaxis = sc.nextInt();
	}
	public void displayPoint() {
		System.out.println("x-coordinate: "+xaxis + " & " + "y-coordinate: "+yaxis);
	}
	
	//p1.isEqual(p2); 
	public boolean isEqual(Point2D p) {
		if(this.xaxis == p.xaxis && this.yaxis == p.yaxis)
			return true;
		return false;
	}	
	
	public String getDetails() {
		return ("x-coordinate: "+xaxis + " & " + "y-coordinate: "+yaxis);
	}
	
}
