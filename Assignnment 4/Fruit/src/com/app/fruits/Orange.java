package com.app.fruits;

public class Orange extends Fruit {

	public Orange(){
		this.setColor("Orange");
		this.setWeight(200.0);
		this.setName("Orange");
		this.setFresh(true);
	}
	
	public String Taste() {
		return "Sour";
	}
}
