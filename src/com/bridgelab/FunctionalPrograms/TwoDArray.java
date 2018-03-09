 package com.bridgelab.FunctionalPrograms;

import com.bridgelab.Utility.Utility;

public class TwoDArray 
{
	public static void main(String[] args) 
	{
	
	System.out.println("Enter the NUmber of rows for array:");
	int rows = Utility.integerinput();
	System.out.println("Enter the NUmber of columns for array:");
	int columns = Utility.integerinput();
	Utility.twodarray(rows,columns);
	
	}

}
