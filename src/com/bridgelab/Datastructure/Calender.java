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

public class Calender 
{
	 
	
	public static void main(String[] args)
	{
       int month = 0;
       int year=0;
      
       System.out.println("Enter the month:");
       month = Utility.readInteger();
       System.out.println("Enter the year:");
       year = Utility.readInteger();
       
       
       Utility.printCalender(month, year);
	}

}
