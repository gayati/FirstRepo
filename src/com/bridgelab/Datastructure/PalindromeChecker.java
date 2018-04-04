/******************************************************************************
 
  
 *  Purpose: 
 *           
 *  @author  Gayatri Kawade
 *  @version 1.0
 *  @since   06-08-2017
 *
 /******************************************************************************/
package com.bridgelab.Datastructure;

import java.util.ArrayDeque;

import com.bridgelab.Utility.Utility;

public class PalindromeChecker {

	public static void main(String[] args)
	{
      System.out.println("Enter the string to check whether it is palindrome or not:");
      String inputstring = Utility.readString();
      String reverse="";
      ArrayDeque<Character> array= new ArrayDeque<>();
      Utility.insertCharacter(inputstring,array);

      reverse = Utility.popCharacter(array,reverse);
      System.out.println(reverse);
      
      if(inputstring.equals(reverse))
      {
    	  System.out.println("Palindrome");
    	  
      }
      else
      {
    	  System.out.println("Not");
      }
      
	
	}

}
