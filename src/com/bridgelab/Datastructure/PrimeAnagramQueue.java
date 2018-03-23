/******************************************************************************
 
  
 *  Purpose: 
 *           
 *  @author  Gayatri Kawade
 *  @version 1.0
 *  @since   06-08-2017
 *
 /******************************************************************************/
package com.bridgelab.Datastructure;

import java.util.ArrayList;

import com.bridgelab.Utility.Utility;

public class PrimeAnagramQueue {

	public static void main(String[] args)
	{
		 ArrayList<Integer> list = Utility.findPrimes();
		 Utility.anagramqueue(list);

	}

}
