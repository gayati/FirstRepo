/******************************************************************************
 
  
 *  Purpose: This program swap the two nibbles and convert the obtained octet afterswapping 
 *           into decimal number.
 *           
 *  @author  Gayatri Kawade
 *  @version 1.0
 *  @since   06-08-2017
 *
 /******************************************************************************/
package com.bridgelab.AlgorithmPrograms;

import com.bridgelab.Utility.Utility;

public class SwapNibble {

	public static void main(String[] args)
	{
		System.out.println("Enter the decimal number:");
		int decimal = Utility.readInteger();
		Utility.swapnibbles(decimal);

	}

}
