package com.assignment;

public class SlectionStatementDemo {
	public static void main(String[] args) {
		PrimeAndEvenNumbers1To100();
		fiabonicSeries();

	}

	public static void PrimeAndEvenNumbers1To100() {
		System.out.println("even numbers 1 to 100");
		for (int i = 1; i <= 100; ++i) {
			if (i % 2 == 0) {

				System.out.print(i);

			}

		}
		System.out.println(".");

		System.out.println("prime numbers 1 to 100");

		for (int i = 2; i <= 100; ++i)
			if (i % 2 == 1)
				System.out.print(i);

	}

	public static void fiabonicSeries() {
		System.out.println(".");
		System.out.println("fiabonicSeries");
		int a = 0;
		int b = 1;
		int c;
		System.out.print(a + "" + b);
		for (int i = 2; i <= 10; ++i) {

			c = a + b;

			System.out.print(c);
			a = b;
			b = c;

		}

	}


}
