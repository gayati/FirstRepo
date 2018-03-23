/******************************************************************************
 
  
 *  Purpose: Find the fewest number of notes to be returned by Vending Machine
 *  @author  Gayatri Kawade
 *  @version 1.0
 *  @since   06-08-2017
 *
 /******************************************************************************/
package com.bridgelab.AlgorithmPrograms;

import com.bridgelab.Utility.Utility;

public class VendingMachine {

	public static void main(String[] args) {

		System.out.println("Enter the amount ");
        int amount = Utility.readInteger();
        Utility.vendingmachine(amount);
	} 

}
