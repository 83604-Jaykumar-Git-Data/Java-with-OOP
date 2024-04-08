package com.app.fruits;

public class Mango extends Fruit {
	
	public Mango(){
		this.setColor("Yellow");
		this.setWeight(300.0);
		this.setName("Mango");
		this.setFresh(true);
	}
	
	public String Taste() {
		return "Sweet";
	}

}
