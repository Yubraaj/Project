package com.assignment;

import java.util.Scanner;

public class ArmstrongNumber {
	public static void main(String[] args) {
		int a;
		int arm = 0;
		int n;
		int temp;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");
		n = scanner.nextInt();
		temp = n;
		for (; n != 0; n /= 10) {
			a = n % 10;
			arm = arm + (a * a * a);
		}
		if (arm == temp)
			System.out.println(temp + " is a armstrong number ");
		else
			System.out.println(temp + " is not a armstrong number ");
	}

}
