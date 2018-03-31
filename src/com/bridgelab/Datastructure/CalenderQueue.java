/******************************************************************************
 
  
 *  Purpose: This Program Prints the calender.
 *           
 *  @author  Gayatri Kawade
 *  @version 1.0
 *  @since   
 *
 /******************************************************************************/
package com.bridgelab.Datastructure;

import com.bridgelab.Utility.Utility;

public class CalenderQueue {

	public static void main(String[] args) throws InterruptedException 
	{
	
		System.out.println("Enter the month");
		int month = Utility.readInteger();
		System.out.println("Enter the year");
		int year=Utility.readInteger();
		Utility.printCalenderQueue(month, year);
		

	}

}
