/******************************************************************************
 
  
 *  Purpose: Determines whether or not n is prime.
 *
 *  @author  BridgeLabz
 *  @version 1.0
 *  @since   06-08-2017
 *
 /******************************************************************************/
package com.bridgelab.FunctionalPrograms;


import com.bridgelab.Utility.Utility;

public class HarmonicSeries {

	public static void main(String[] args)
	{
		
		int number;
		System.out.println("Enter the number:");
		number = Utility.integerinput();
		Utility.harmonicseries(number);
		
	}

}
