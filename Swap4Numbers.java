package com.assignment;

public class Swap4Numbers {
	public static void main(String[] args) {
		int number1= 23;
		int number2=5;
		int number3=10;
		int number4=35;
		System.out.println("Before swapping numbers");
		System.out.println("num1 :"+number1+"\t"+"num2 :"+number2 + "\t" +"num3 :"+number3+"\t"+"num4 :"+number4);
		System.out.println("-------------------------");
		 System.out.println("swapping  4 numbers with temp variable");
		 
		 int x = number1;
		 number1 = number2;
		 number2= number3;
		 number3=number4;
		 number4=x;
		 
		 System.out.println("num1 :"+number1+"\t"+"num2 :"+number2 + "\t" +"num3 :"+number3+"\t"+"num4 :"+number4);
		 System.out.println("-------------------------");
	}
}


