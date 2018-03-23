/******************************************************************************
 
  
 *  Purpose: Determine all possible permutation of user input string and print them.
 *
 *  @author  Gayatri Kawade
 *  @version 1.0
 *  @since   06-08-2017
 *
 /******************************************************************************/
package com.bridgelab.FunctionalPrograms;

import com.bridgelab.Utility.Utility;

public class StringPermutation {

	public static void main(String[] args) {
		System.out.println("Enter the String");
		String inputstring = Utility.readString();
	
		int first = 0;
		int last = inputstring.length();
		Utility.permutationsOfString(inputstring,first,last-1);
	}

}
