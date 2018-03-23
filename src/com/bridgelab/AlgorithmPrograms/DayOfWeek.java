

/******************************************************************************


 *  Purpose: This program take date as input and print day of week on which that 
 *           date falls on.
 *  
 *  @author  Gayatri Kawade
 *  @version 1.0
 *  @since   06-08-2017
 *
 /******************************************************************************/
package com.bridgelab.AlgorithmPrograms;
import com.bridgelab.Utility.Utility;

public class DayOfWeek {

	public static void main(String[] args) 
	{
		
		System.out.println("Enter the day:");
		int day = Utility.readInteger();
		if(day<1 || day>31)
		{
			System.out.println("Day is invalid");
			System.exit(0);
		}
		System.out.println("Enter the month:");
		int month = Utility.readInteger();
		if(month<1 || month>12)
		{
			System.out.println("Month is invalid");
			System.exit(0);
		}
		System.out.println("Enter the year");
		int year = Utility.readInteger();
		String year1 = Integer.toString(year);
		if(year1.length() !=4)
		{
			System.out.println("Year in invalid");
			System.exit(0);
		}
		
		int d=Utility.dayOfweek(day,month, year);
		System.out.println("Date is:- " + day+"/"+month+"/"+year);
		if(d==0)
		{
			System.out.println("Week day is : sunday");
		}
		if(d==1)
		{
			System.out.println("Week day is : monday");
		}
		if(d==2)
		{
			System.out.println("Week day is : tuesday");
		}
		if(d==3)
		{
			System.out.println("Week day is :wednesday");
		}
		if(d==4)
		{
			System.out.println("Week day is : thursday");
		}
		if(d==5)
		{
			System.out.println("Week day is : friday");
		}
		if(d==6)
		{
			System.out.println("Week day is : saturday");
		}

	}

}
