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

public class StringReplace {

	public static void main(String[] args) 
	{
		String inputstring = null;
		System.out.println("Enter the username to be replaced");
		inputstring = Utility.stringinput();
		Utility.stringreplace(inputstring);
}

}
