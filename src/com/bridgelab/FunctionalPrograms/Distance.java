/******************************************************************************
 
  
 *  Purpose: Take user input for x and y values and calculate distance from the point(x,y) to origin(0,0).
 *
 *  @author  Gayatri Kawade
 *  @version 1.0
 *  @since   06-08-2017
 *
 /******************************************************************************/
package com.bridgelab.FunctionalPrograms;

import com.bridgelab.Utility.Utility;

public class Distance {

	public static void main(String[] args) 
	{
		
		System.out.println("Enter the x coenfficient:");
		double x = Utility.readInteger();
		System.out.println("Enter the y coenfficient:");
		double y = Utility.readInteger();
		Utility.calculateDistance(x, y);

	}

}
