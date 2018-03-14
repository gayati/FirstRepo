/******************************************************************************
 
  
 *  Purpose: Determines whether or not n is prime.
 *
 *  @author  BridgeLabz
 *  @version 1.0
 *  @since   06-08-2017
 *
 /******************************************************************************/
package com.bridgelab.FunctionalPrograms;

import com.bridgelab.Utility.Utility;

public class TwoDArray 
{
	public static void main(String[] args) 
	{
		System.out.println("1.IntegerArray");
		System.out.println("2.DoubleArray");
		System.out.println("3.BooleanArray");
		System.out.println("Enter your choice:");
	    int number = Utility.integerinput();
	switch (number) {
	case 1:Utility.integerarray();
		
		break;
	case 2:Utility.doubleArray();
	
	break;
	
    case 3:Utility.booleanArray();
	
	break;

	default:
		break;
	}
	
	
	}

}
