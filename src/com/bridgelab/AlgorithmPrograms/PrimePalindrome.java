/******************************************************************************
 
  
 *  Purpose: Find prime numbers that are palindrome in the range of 0-1000.
 *
 *  @author  BridgeLabz
 *  @version 1.0
 *  @since   06-08-2017
 *
 /******************************************************************************/

package com.bridgelab.AlgorithmPrograms;

import java.util.ArrayList;

import com.bridgelab.Utility.Utility;

public class PrimePalindrome {

	public static void main(String[] args) {
		ArrayList<Integer> list = Utility.findPrimes();
        Utility.findPrimePalindrome(list);
	}

}
