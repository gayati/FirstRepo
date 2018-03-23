/******************************************************************************
 
  
 *  Purpose: Calculate percentage of head and tail by taking user input for number of times to flip the coin.
 *
 *  @author  Gayatri Kawade
 *  @version 1.0
 *  @since   06-08-2017
 *
 /******************************************************************************/
package com.bridgelab.FunctionalPrograms;
import com.bridgelab.Utility.*;

public class FlipCoin {

	public static void main(String[] args) 
	{
		
		int noOfTimes;
		System.out.println("Enter the number of times to flip the coin");
		noOfTimes = Utility.readInteger();
		Utility.findPercentage(noOfTimes);
	}

}
