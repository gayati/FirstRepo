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

public class Quadratic {

	public static void main(String[] args)
	{
	 System.out.println("Enter the value of a,b & c");	
	 double a = Utility.doubleinput();
	 double b = Utility.doubleinput();
	 double c = Utility.doubleinput();
	 Utility.quadratic(a,b,c);
	}

}
