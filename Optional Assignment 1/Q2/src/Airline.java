import java.util.Scanner;
public class Airline {

	private boolean seat[] = new boolean[10];
	private int FirstClass = 0;
	private int EconomyClass = 5;

	public boolean isFirstClassOccupied() {
		if (FirstClass < 5) {
			seat[FirstClass++] = true;
			return true;
		} else
			return false;
	}

	public boolean isEconomyClassOccupied() {
		if (EconomyClass < 10) {
			seat[EconomyClass++] = true;
			return true;
		} else
			return false;
	}

	public int getFirstClass() {
		return FirstClass;
	}

	public void setIndexForFirstClass(int FirstClass) {
		this.FirstClass = FirstClass;
	}

	public int getEconomyClass() {
		return EconomyClass;
	}

	public void setIndexForEconomyClass(int EconomyClass) {
		this.EconomyClass = EconomyClass;
	}

	public boolean[] getSeat() {
		return seat;
	}

	private static void menu() {
		System.out.println("0. Exit");
		System.out.println("1. First Class Booking");
		System.out.println("2. Second Class Booking");
		System.out.println("Enter your choice ");
	}

	public static void main(String[] args) {

		Airline arl = new Airline();
		int choice = 0;
		Scanner sc = new Scanner(System.in);
		do {
			menu();
			choice = sc.nextInt();
			switch (choice) {
			case 0:
				System.out.println("Thank You");
				break;
			case 1: {
				if (arl.isFirstClassOccupied())
					System.out.println("seat number in First Class " + arl.getFirstClass());
				else
				{
					System.out.println("First Class Is Full!!");
					System.out.println("If urgent!! Would you downgrade to economy class??");
					System.out.println("Enter 1 for yes and 2 for no");
					int opt = sc.nextInt();
					if(opt == 1) {
						if (arl.isEconomyClassOccupied())
							System.out.println("seat number in Economy Class  " + arl.getEconomyClass());
						else
							System.out.println("Economy Class Is Also Full!!!");
						break;
						}					
				}						
			}
				break;
			case 2: {
				if (arl.isEconomyClassOccupied())
					System.out.println("seat number in Economy Class  " + arl.getEconomyClass());
				else	
				{
					System.out.println("Economy Class Is Full!!!");
					System.out.println("If urgent!! Would you like to Updgrade to First class??");
					System.out.println("Enter 1 for yes and 2 for no");
					int opt = sc.nextInt();
					if(opt == 1) {
						if (arl.isFirstClassOccupied())
							System.out.println("seat number in First Class " + arl.getFirstClass());
						else
							System.out.println("First Class Is Also Full!!!");
						break;
						}
				}
			}
				break;
			default:
				System.out.println("Invalid Choice");
				break;
			}
		} while (choice != 0);

	}

}