import java.util.Scanner;

public class Card {
	private int accNumber;
	private int pendingbalance;
	private int totalItems;
	private int totalCredits;
	private int creditLimit;
	private int charges;
	private int newBalance;

	Scanner sc = new Scanner(System.in);

	public void accept() {

		System.out.println("Enter account number");
		accNumber = sc.nextInt();
		System.out.println("Enter pending balance at the beginning of the month");
		pendingbalance = sc.nextInt();
		System.out.println("Enter total of all items charged by the customer this month");
		totalItems = sc.nextInt();
		System.out.println("Enter total of all credits applied to the customer’s account this month");
		totalCredits = sc.nextInt();
		System.out.println("Enter allowed credit limit");
		creditLimit = sc.nextInt();

		newBalance = (pendingbalance + totalItems - totalCredits);
	}

	public void display() {

		System.out.println("new balance: " + newBalance);
		if (newBalance > creditLimit) {
			System.out.println("Credit limit exceeded");
		} else {
			System.out.println("Not exceeded");
		}
	}
}
