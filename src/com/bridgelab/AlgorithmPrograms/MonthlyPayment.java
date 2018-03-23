/******************************************************************************
 
  
 *  Purpose: This program calculate monthly payment for user input principal 
 *           amount,rate of interest and year.
 *           
 *  @author  Gayatri Kawade
 *  @version 1.0
 *  @since   06-08-2017
 *
 /******************************************************************************/
package com.bridgelab.AlgorithmPrograms;

import com.bridgelab.Utility.Utility;

public class MonthlyPayment {

	public static void main(String[] args) 
	{
		System.out.println("Enter the principal amount:");
		double principal = Utility.readDouble();
		System.out.println("Enter the rate of interest:");
		double rateofinterest = Utility.readDouble();
		System.out.println("Enter the number of year");
		double year = Utility.readDouble();
		Utility.monthlypayment(principal, rateofinterest, year);
		
		

	}

}
