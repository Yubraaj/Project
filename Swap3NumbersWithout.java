package com.assignment;

public class Swap3NumbersWithout {
	public static void main(String[] args) {
		int n1= 23;
		int n2=5;
		int n3=10;
		
		System.out.println("Before swapping numbers");
		System.out.println("num1 :"+n1+"\t"+"num2 :"+n2 + "\t" +"num3 :"+n3+"\t");
		System.out.println("-------------------------");
		 System.out.println("swapping  3 numbers without temp variable");
		 
		 n1 = n1+n2+n3;
		 n2= n1-(n2+n3);
		 n3=n1-(n2+n3);
		 n1=n1-(n2+n3);
		 
		 System.out.println("num1 :"+n1+"\t"+"num2 :"+n2 + "\t" +"num3 :"+n3);
		 System.out.println("-------------------------");
		}
}
