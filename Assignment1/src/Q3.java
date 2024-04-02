//3. Display food menu to user. User will select items from menu along with the quantity. (eg 1. Dosa
//2. Samosa 3. Idli ... 10 . Generate Bill ) Assign fixed prices to food items(hard code the prices)
//When user enters 'Generate Bill' option , display total bill & exit.
//(No need of any class, and no need to display the food deatils. Only display the total of orderd
//food)

import java.util.Scanner;

class Q3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int amount=0;
		int choice;
		int total =0;
		int qty =0;
		
		do {
			System.out.println("0. Exit");
			System.out.println("1. Dosa");
			System.out.println("2. Samosa");
			System.out.println("3. Idli");
			System.out.println("4. Bill");
			System.out.println("Enter a choice");
			choice = sc.nextInt();
			
			switch(choice) {
			case 0:
				System.out.println("thank you");
				break;
			case 1:
				System.out.println("Enter the quantity: ");
				qty=sc.nextInt();
				total = total + ( 30 * qty);
				break;
			case 2:
				System.out.println("Enter the quantity: ");
				qty=sc.nextInt();
				total = total +( 15 * qty);
				break;
			case 3:
				System.out.println("Enter the quantity: ");
				qty=sc.nextInt();
				total = total +( 20 * qty);
				break;
			case 4:
				if(total<0) {
					System.out.println("Please select a item");
				}
				else
				System.out.println("total value is: "+total);
				break;
			case 5:
				default:
				System.out.println("Enter a correct choice: ");
				break;
			}	
		}while(choice != 4);
	}

}
