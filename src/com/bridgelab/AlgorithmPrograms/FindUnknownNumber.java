/******************************************************************************
 
  
 *  Purpose: This program is for finding secret number in the users mind.
 *
 *  @author  Gayatri Kawade
 *  @version 1.0
 *  @since   06-08-2017
 *
 /******************************************************************************/
package com.bridgelab.AlgorithmPrograms;

import com.bridgelab.Utility.Utility;

public class FindUnknownNumber {

	public static void main(String[] args)
	{
        System.out.println("Enter the number:");
        int number = Utility.readInteger();
        int number1 = (int) Math.pow(2, number);
        System.out.println(number1);
        System.out.println("Think any number between" + " "+0 +"  "+ " " +"to" + "  " + (number1-1));
        int secretnumber = Utility.findSecreteNumber(0, number1-1);
        System.out.println("The number assumed by user will be:");
        System.out.println(secretnumber);
   	}

}
