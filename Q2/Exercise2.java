package Labbook5.Q2;

import java.util.Scanner;

class NameCannotBeBlank extends Exception {
	/**
		 * 
		 */
	private static final long serialVersionUID = 1L;

	NameCannotBeBlank(String msg) {
		super(msg);
	}
}

public class Exercise2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first name");
		String firstName = sc.nextLine();
		System.out.println("enter last name");
		String lastName = sc.nextLine();
		sc.close();
		validate(firstName, lastName);
	}

	public static void validate(String firstName, String lastName) {
		try {
			if (firstName.length() == 0) {
				throw new NameCannotBeBlank("First name cannot be left blank");
			} else if (lastName.length() == 0) {
				throw new NameCannotBeBlank("Last name cannot be left blank");
			} else {
				System.out.println("Name validated successfully.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
