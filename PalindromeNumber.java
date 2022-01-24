package com.assignment;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		String enteredNumber = "";
		String reverseNumber = "";
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");
		enteredNumber = scanner.nextLine();
		int lengthOfNumber = enteredNumber.length();

		for (int i = lengthOfNumber - 1; i >= 0; i--) 

			reverseNumber = reverseNumber + enteredNumber.charAt(i);

			if (enteredNumber.equals(reverseNumber))
				System.out.println(enteredNumber + " is a palindrome number");

			else
				System.out.println(enteredNumber + " is not palindrome number");

		
	}
}
