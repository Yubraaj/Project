package com.assignment;

public class CostCalculation {
	
	public static void main(String[] args) {
		
		CostOfInternet();
		CostCalculation costCalculation = new CostCalculation();
		costCalculation.TotalBillDue();
		TaxCalculation();
		costCalculation.Interest();
		
	}
	public static void CostOfInternet() {
		int silverPlan = 699;
		float gst =(float)0.180* silverPlan;
		float totalCost = (silverPlan + gst);
		System.out.println("The total cost of silver plan after gst is "+totalCost);
		
		System.out.println("-------------------------------------------");
	}
	public  void TotalBillDue() {
		int no = 2;
		float price= 399;
		float cost =(float) no * price;
		float discount = (float)0.20 *  cost;
		float billDue = cost -discount;
		System.out.println("Total bill due after 20% discount : "+billDue);
		System.out.println("-------------------------------------------");
		
	}
	public static void TaxCalculation() {
		int salary = 85000;
		float incomeTax = (float)0.20 *salary;
		System.out.println("Tax paid : "+incomeTax);
		System.out.println("Income after tax : "+(salary-incomeTax));
		System.out.println("-------------------------------------------");
		

		
	}
	public  void Interest() {
		int principle = 50000;
		int time = 5;
		float rate =(float) (6.8/100);
		float interest = (float)(principle*time*rate)/100;
		float TotalAmount = principle + interest;
		System.out.println("rate : "+rate);
		System.out.println("Interest : "+interest);
		System.out.println("Total Amount :"+ TotalAmount);
		
	
	
	}
	

}
