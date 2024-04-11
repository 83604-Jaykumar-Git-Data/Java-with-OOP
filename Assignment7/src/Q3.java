//Q3. write a java program to count number of words in a String.
//Hint: You can use , trim() , length() and split() methods

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String ");
		String str = sc.nextLine();
		String tr = str.trim();
		
//		String[] ans = tr.split("\\s+");
//		OR
		
		String[] ans = tr.split(" ");
		System.out.println(ans.length);
		
	}

}
