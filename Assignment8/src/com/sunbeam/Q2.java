package com.sunbeam;
import java.util.*;

public class Q2 {

	public static void Menu() {
		System.out.println("0. Exit");
		System.out.println("1. sort on city (asc)");
		System.out.println("2. sort on marks (desc)");
		System.out.println("3. sort on name (asc)");								
		System.out.println("Enter the choice ");
	}

	public static void main(String[] args) {
		Student arr[] = new Student[5];
		arr[0] = new Student(3, "vinay", "Pune", 100);
		arr[1] = new Student(1, "jay", "Mumbai", 200);
		arr[2] = new Student(2, "suresh", "Navi", 500);
		arr[3] = new Student(5, "ashu", "karad", 250);
		arr[4] = new Student(4, "rushi", "satara", 350);
		
		int choice = 0;

		do {
			Menu();
			choice = new Scanner(System.in).nextInt();
			switch (choice) {
			case 0:
				System.out.println("Thank you for using the app");
				break;
			case 1: {
				System.out.println("Before Sorting ");
				for (Student Student : arr)
					System.out.println(Student);

				Arrays.sort(arr, new Comparator<Student>() {

					@Override
					public int compare(Student o1, Student o2) {
						return o1.getCity().compareTo(o2.getCity());
					}
				});

				System.out.println("After Sorting ");
				for (Student Student : arr)
					System.out.println(Student);

			}
				break;
			case 2: {
				System.out.println("Before Sorting ");
				for (Student Student : arr)
					System.out.println(Student);

				Arrays.sort(arr, new Comparator<Student>() {

					@Override
					public int compare(Student o1, Student o2) {
						return Double.compare(o2.getMarks(), o1.getMarks());
					}
				});

				System.out.println("After Sorting ");
				for (Student Student : arr)
					System.out.println(Student);

			}
				break;
			case 3: {
				System.out.println("Before Sorting ");
				for (Student Student : arr)
					System.out.println(Student);

				Arrays.sort(arr, new Comparator<Student>() {

					@Override
					public int compare(Student o1, Student o2) {
						return o1.getName().compareTo(o2.getName());
					}
				});

				System.out.println("After Sorting ");
				for (Student Student : arr)
					System.out.println(Student);

			}
				break;

			default:
				System.out.println("Invalid choice");
				break;
			}

		} while (choice != 0);
	}

}