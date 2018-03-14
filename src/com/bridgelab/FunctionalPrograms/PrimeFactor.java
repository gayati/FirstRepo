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

public class PrimeFactor {

	public static void main(String[] args)
	{
		
		System.out.println("Enter the number of which the prime factors are to be find:");
		int number = Utility.integerinput();
		Utility.primefactor(number);
		
		
	}

}
