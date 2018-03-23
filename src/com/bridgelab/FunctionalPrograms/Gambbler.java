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

public class Gambbler {

	public static void main(String[] args) {
		    int stack;
	   		int goals;
	   		int no_of_times;
	   		System.out.println("Enter your stack price:");
	   	    stack = Utility.readInteger();
	   	    System.out.println("Enter you goal price");
	   	    goals = Utility.readInteger();
	   	    System.out.println("Enter the number of times you want to play");
	   	    no_of_times = Utility.readInteger();
		    Utility.gambler(stack,goals,no_of_times);

	}

}
