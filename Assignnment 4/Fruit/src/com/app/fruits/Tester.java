package com.app.fruits;

import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of basket: ");
		int basketSize = sc.nextInt();
		Fruit[] basket = new Fruit[basketSize];
		int counter = 0;
		int choice;

		do {
			System.out.println("0. Exit");
			System.out.println("1. Add Mango");
			System.out.println("2. Add Orange");
			System.out.println("3. Add Apple");
			System.out.println("4. Display all fruit names");
			System.out.println("5. Display name,color,weight,taste of all fresh fruits in the basket");
			System.out.println("6. Display tastes of all stale(not fresh) fruits in the basket");
			System.out.println("7. Mark a fruit as stale");
			System.out.println("8. Mark all sour fruits stale (optional)");
			System.out.println("Enter choice");
			choice = sc.nextInt();

			switch (choice) {
			case 0:
				System.out.println("Thank you");
				break;

			case 1:
				if (counter < basketSize) {
					basket[counter] = new Mango();
					System.out.println("Mango Added");
					System.out.println("**************************");
					counter++;
				} else {
					System.out.println("Basket is full");
				}
				break;

			case 2:
				if (counter < basketSize) {
					basket[counter] = new Orange();
					System.out.println("Orange Added");
					System.out.println("**************************");
					counter++;
				} else {
					System.out.println("Basket is full");
				}
				break;

			case 3:
				if (counter < basketSize) {
					basket[counter] = new Apple();
					System.out.println("Apple Added");
					System.out.println("**************************");
					counter++;
				} else {
					System.out.println("Basket is full");
				}
				break;
			case 4:
				for (int i = 0; i < counter; i++) {
					System.out.println(i + " : " + basket[i].getName());
					System.out.println("**************************");
				}
				break;

			case 5:
				for (int i = 0; i < counter; i++) {
					System.out.println("Taste of " + basket[i].getName() + " is: " + basket[i].Taste() + " " + "color is: "+basket[i].getColor() + " " +"weight is: "+basket[i].getWeight());
//					System.out.println("fruit in basket is: "+);
					System.out.println("**************************");
				}
				break;
				
			case 6:
				boolean flag = true;
				
				for(int i=0;i<counter;i++) {
					if(!basket[i].isFresh()) {
						System.out.println("taste of " + basket[i].getName() + " is: " + basket[i].Taste());
						flag = false;
					}
				}
				if(flag)
     			System.out.println("no fruits are stale");
				break;
				
			case 7:
				System.out.println("Provide index no of stale fruit");
				int mark = sc.nextInt();

				basket[mark].setFresh(false);
				System.out.println("Fruit is marked as stale");
				break;
				
			case 8:
				for(int i=0;i<counter;i++) {
					if(basket[i].Taste().equals("sour")) {
						basket[i].setFresh(false);
					}
				}
				break;

			default:
				System.out.println("Enter correct choice");
				break;
			}

		} while (choice != 0);

	}

}
