import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String ");
		String str = sc.nextLine();
		
		StringBuilder rev = new StringBuilder(str).reverse();
		System.out.println(rev);
	}
}
