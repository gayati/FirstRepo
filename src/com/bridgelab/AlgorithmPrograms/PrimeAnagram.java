/******************************************************************************
 
  
 *  Purpose: Find prime numbers that are anagrams in the range of 0-1000.
 *
 *  @author  Gayatri Kawade
 *  @version 1.0
 *  @since   06-08-2017
 *
 /******************************************************************************/

package com.bridgelab.AlgorithmPrograms;

import java.util.ArrayList;

import com.bridgelab.Utility.Utility;

public class PrimeAnagram {

	public static void main(String[] args) {
		ArrayList<Integer> list = Utility.findPrimes();
		Utility.findPrimeAnagram(list);
		
	}

}
