/******************************************************************************
 
  
 *  Purpose: This program calculate the squareroot of any non-zero value.
 *           
 *  @author  Gayatri Kawade
 *  @version 1.0
 *  @since   06-08-2017
 *
 /******************************************************************************/
package com.bridgelab.AlgorithmPrograms;

import com.bridgelab.Utility.Utility;

public class Squrt {

	public static void main(String[] args) {
		System.out.println("Enter any nonzero number");
		double number = Utility.readDouble();
		if(number<0)
		{
			System.out.println("Please enter valid input");
		}
		else
		{
		Utility.findSquareroot(number);
		}

	}

}
