/******************************************************************************
 
  
 *  Purpose: Write a programe to find roots of Quadratic Equation.
 *
 *  @author  Gayatri Kawade
 *  @version 1.0
 *  @since   06-08-2017
 *
 /******************************************************************************/
package com.bridgelab.FunctionalPrograms;

import com.bridgelab.Utility.Utility;

public class Quadratic {

	public static void main(String[] args)
	{
	 System.out.println("Enter the value of a,b & c");	
	 double a = Utility.readDouble();
	 double b = Utility.readDouble();
	 double c = Utility.readDouble();
	 Utility.findRootsOfEquation(a,b,c);
	}

}
