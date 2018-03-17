package com.bridgelab.Datastructure;

import com.bridgelab.Utility.Utility;

public class Calender 
{
	 
	
	public static void main(String[] args)
	{
       int month = 0;
       int year=0;
      
       System.out.println("Enter the month:");
       month = Utility.integerinput();
       System.out.println("Enter the year:");
       year = Utility.integerinput();
       
       
       Utility.printCalender(month, year);
	}

}
