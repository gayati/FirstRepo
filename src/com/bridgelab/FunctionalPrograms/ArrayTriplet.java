/******************************************************************************
 
  
 *  Purpose: Determine the number of array triplet that sum to eaxctly zero.
 *
 *  @author  Gayatri Kawade.
 *  
 *  @since   06-08-2017
 *
 /******************************************************************************/
package com.bridgelab.FunctionalPrograms;

import com.bridgelab.Utility.Utility;

public class ArrayTriplet {
	
	public static void main(String[] args) 
	{
	 System.out.println("Enter the size of array:");
     int size  = Utility.readInteger();
     Utility.arraytriplet(size);
	}

}
