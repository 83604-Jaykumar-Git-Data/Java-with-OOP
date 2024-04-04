package com.app.point;
import java.util.Scanner;

public class Point2D {
	private int xaxis;
	private int yaxis;
	
	
	public int getXaxis() {
		return xaxis;
	}

	public void setXaxis(int xaxis) {
		this.xaxis = xaxis;
	}

	public int getYaxis() {
		return yaxis;
	}

	public void setYaxis(int yaxis) {
		this.yaxis = yaxis;
	}

	public Point2D() {
		xaxis = 0;
		yaxis =0;
	}

	public Point2D(int xaxis, int yaxis) {
		this.xaxis = xaxis;
		this.yaxis = yaxis;
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
	public boolean isEqual(Point2D p2) {
		if(this.xaxis == p2.xaxis && this.yaxis == p2.yaxis)
			return true;
		return false;
	}	
	
	public String getDetails() {
		String result;
		result = "x-coordinate: "+xaxis + " & " + "y-coordinate: "+yaxis;
		return result;
	}
	
	public void calculateDistance(Point2D p2) {
		int x1= this.xaxis - p2.getXaxis();
		int y1=this.yaxis - p2.getYaxis();
		
		int dis=(int) Math.sqrt(Math.pow(x1, 2)+Math.pow(y1, 2));
		
		System.out.println("Distance is "+dis);
	}
	
}