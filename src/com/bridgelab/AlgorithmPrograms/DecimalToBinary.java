/******************************************************************************
 
  
 *  Purpose: This program convert decimal number into binary.
 *           
 *  @author  Gayatri Kawade
 *  @version 1.0
 *  @since   06-08-2017
 *
 /******************************************************************************/
package com.bridgelab.AlgorithmPrograms;

import com.bridgelab.Utility.Utility;

public class DecimalToBinary {

	public static void main(String[] args) {
		System.out.println("Enter the decimal number:");
		int decimal = Utility.readInteger();
		Utility.toBinary(decimal);

	}

}
