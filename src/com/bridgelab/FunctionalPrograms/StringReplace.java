/******************************************************************************
 
  
 *  Purpose: Replace particular string by accepting input string from user.
 *
 *  @author  Gayatri Kawade
 *  
 *  @since   06-08-2017
 *
 /******************************************************************************/
package com.bridgelab.FunctionalPrograms;
import com.bridgelab.Utility.Utility;

public class StringReplace {

	public static void main(String[] args) 
	{
		String inputString = null;
		System.out.println("Enter the username to be replaced");
		inputString = Utility.readString();
		Utility.replaceString(inputString);
}

}
