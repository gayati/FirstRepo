/******************************************************************************
 
  
 *  Purpose: Determines whether the user input strings are anagram or not.
 *
 *  @author  Gayatri Kawade
 *  @version 1.0
 *  @since   06-08-2017
 *
 /******************************************************************************/

package com.bridgelab.AlgorithmPrograms;

import com.bridgelab.Utility.Utility;

public class StringAnagram {

	public static void main(String[] args) 
	{
		boolean flag = false;
        System.out.println("Enter the first string");
        String inputstring1 = Utility.readString();
        System.out.println("Enter the second string");
        String inputstring2 = Utility.readString();
        flag = Utility.isAnagram(inputstring1, inputstring2);
        if(flag)
     	   {
     		   System.out.println("String is Anagram");
     		  
     		   
     	   }
     	   else
     	   {
     		   System.out.println("String is notAnagram");
     		   
     	   }
	}

}
