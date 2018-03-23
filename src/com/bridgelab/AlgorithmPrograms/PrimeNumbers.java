/******************************************************************************
 
  
 *  Purpose: Find prime numbers that are in the range of 0-1000.
 *
 *  @author  BridgeLabz
 *  @version 1.0
 *  @since   06-08-2017
 *
 /******************************************************************************/

package com.bridgelab.AlgorithmPrograms;

import java.util.ArrayList;

import com.bridgelab.Utility.Utility;

public class PrimeNumbers {

	public static void main(String[] args)
	{
		ArrayList<Integer> list = Utility.findPrimes();
		for(Integer primes:list)
	    { 
		System.out.println(primes);	
	    }
	}

}
