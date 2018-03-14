package com.bridgelab.AlgorithmPrograms;

import com.bridgelab.Utility.Utility;

public class MonthlyPayment {

	public static void main(String[] args) 
	{
		System.out.println("Enter the principal amount:");
		double principal = Utility.doubleinput();
		System.out.println("Enter the rate of interest:");
		double rateofinterest = Utility.doubleinput();
		System.out.println("Enter the number of year");
		double year = Utility.doubleinput();
		Utility.monthlypayment(principal, rateofinterest, year);
		
		

	}

}
