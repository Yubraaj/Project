package com.assignment;

public class Swap3Numbers {
	
	public static void main(String[] args) {
		int no1= 23;
		int no2=5;
		int no3=10;
		
		System.out.println("Before swapping numbers");
		System.out.println("num1 :"+no1+"\t"+"num2 :"+no2 + "\t" +"num3 :"+no3+"\t");
		System.out.println("-------------------------");
		System.out.println("swapping  3 numbers with temp variable");
		
		int x = no1;
		 no1 = no2;
		 no2= no3;
		 no3=x;
		 
		 System.out.println("num1 :"+no1+"\t"+"num2 :"+no2 + "\t" +"num3 :"+no3); 
		 
		 System.out.println("-------------------------");
	}

}
