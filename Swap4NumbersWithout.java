package com.assignment;

public class Swap4NumbersWithout {
	public static void main(String[] args) {
		int num1= 23;
		int num2=5;
		int num3=10;
		int num4=35;
		System.out.println("Before swapping numbers");
		System.out.println("num1 :"+num1+"\t"+"num2 :"+num2 + "\t" +"num3 :"+num3+"\t"+"num4 :"+num4);
		System.out.println("-------------------------");
		 System.out.println("swapping  4 numbers without temp variable");
		 num1 = num1+num2+num3+num4;
		 num2= num1-(num2+num3+num4);
		 num3=num1-(num2+num3+num4);
		 num4=num1-(num2+num3+num4);
		 num1=num1-(num2+num3+num4);
		 System.out.println("num1 :"+num1+"\t"+"num2 :"+num2 + "\t" +"num3 :"+num3+"\t"+"num4 :"+num4);

}
}
