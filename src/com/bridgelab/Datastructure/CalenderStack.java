/******************************************************************************
 
  
 *  Purpose: 
 *           
 *  @author  Gayatri Kawade
 *  @version 1.0
 *  @since   06-08-2017
 *
 /******************************************************************************/
package com.bridgelab.Datastructure;

import com.bridgelab.Utility.Utility;

public class CalenderStack {

	public static void main(String[] args)
	{
		System.out.println("Enter the month");
		int month = Utility.readInteger();
		System.out.println("Enter the year");
		int year=Utility.readInteger();
		Utility.printstack(month, year);
	}

}
