/******************************************************************************
 
  
 *  Purpose: Print the table for power of two by taking input from user for power value.
 *
 *  @author  BridgeLabz
 *  @version 1.0
 *  @since   06-08-2017
 *
 /******************************************************************************/
package com.bridgelab.FunctionalPrograms;
import com.bridgelab.Utility.Utility;

public class PowerOfTwo {

	public static void main(String[] args) {
		System.out.println("Enter the number:");
		int number = Utility.readInteger();
		Utility.powerOfTwo(number);
	}

}
