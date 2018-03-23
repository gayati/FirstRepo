/******************************************************************************
 
  
 *  Purpose: Take input from user and print two dimensinal array.
 *
 *  @author  Gayatri Kawade
 *  @version 1.0
 *  @since   06-08-2017
 *
 /******************************************************************************/
package com.bridgelab.FunctionalPrograms;

import com.bridgelab.Utility.Utility;

public class TwoDArray {
	public static void main(String[] args) {
		System.out.println("1.IntegerArray");
		System.out.println("2.DoubleArray");
		System.out.println("3.BooleanArray");
		System.out.println("Enter your choice:");
		int number = Utility.readInteger();
		 System.out.println("Enter the NUmber of rows for array:");
 		int rows = Utility.readInteger();
 		System.out.println("Enter the NUmber of columns for array:");
 		int columns = Utility.readInteger();
	    System.out.print("Enter " +(rows*columns)+ " Array Elements : ");

		switch (number) {
		case 1:
		
			Integer[][] array = new Integer[rows][columns];
			Utility.inputIntegerArray(array, rows, columns);
			break;

		case 2:
			Double[][] doublearray = new Double[rows][columns];
			Utility.inputDoubleArray(doublearray, rows, columns);
			break;

		case 3:
			Boolean[][] booleanArray = new Boolean[rows][columns];
            Utility.inputBooleanArray(booleanArray, rows, columns);
			break;

		default:
			break;
		}

	}

}
