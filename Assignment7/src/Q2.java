import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String ");
		String str = sc.nextLine();
		
		StringBuilder rev = new StringBuilder(str).reverse();
		
		if(rev.toString().equals(str))
			System.out.println("Palindrome");
		else 
			System.out.println("Not Palindrome");		
	}
}