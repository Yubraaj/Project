package com.assignment;

import java.util.Scanner;

public class OperatorsAssignment {
	public static void main(String[] args) {
		OperatorsAssignment operatorsAssignment = new OperatorsAssignment();
		operatorsAssignment.EvenOrNot();
		operatorsAssignment.OddOrNot();
		operatorsAssignment.leapYearOrNot();

	}

	public void EvenOrNot() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");
		int x = scanner.nextInt();
		if (x % 2 == 0)
			System.out.println(x + " is even number");
		else
			System.out.println(x + " is not even number");

	}

	public void OddOrNot() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");
		int y = scanner.nextInt();
		if (y % 2 == 1)
			System.out.println(y + " is odd number");
		else
			System.out.println(y + " is not odd number");

	}

	public void leapYearOrNot() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");
		int year = scanner.nextInt();
		if (year % 4 == 0)
			System.out.println(year + " is leap year");
		else
			System.out.println(year + " is not leap year");

	}

}
