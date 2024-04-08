import java.util.Scanner;

public class Airline {
	private String name;
	private int preference;
	private int seatNo;
	
	Scanner sc = new Scanner(System.in);
	
	public void accept() {
		System.out.println("Enter name");
		name = sc.next();
		System.out.println("Enter preference 1.First Class and 2.Economy.");
		preference = sc.nextInt();
	}
	
	public void display() {
		System.out.println("Name: "+name);
		System.out.println("Class: "+preference);
		System.out.println("seat no:"+seatNo);
	}
}
