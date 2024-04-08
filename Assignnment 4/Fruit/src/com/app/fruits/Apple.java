package com.app.fruits;

public class Apple extends Fruit {
	
	public Apple(){
		this.setColor("Red");
		this.setWeight(100.0);
		this.setName("Apple");
		this.setFresh(true);
		
	}

	public String Taste() {
		return "Sweet and sour";
	}
	
}
