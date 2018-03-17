package com.bridgelab.Datastructure;

import java.util.ArrayDeque;

import com.bridgelab.Utility.Utility;

public class PalindromeChecker {

	public static void main(String[] args)
	{
      System.out.println("Enter the string to check whether it is palindrome or not:");
      String inputstring = Utility.stringinput();
      String reverse="";
      ArrayDeque<Character> array= new ArrayDeque<>();
      Utility.insertCharacter(inputstring,array);

      reverse = Utility.popCharacter(array,reverse);
      System.out.println(reverse          );
      
      if(inputstring.equals(reverse))
      {
    	  System.out.println("Palindrome");
    	  
      }
      else
      {
    	  System.out.println("Not");
      }
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
//      MyDeque dequeue = new MyDeque();
//      for(int i=0; i<=string.length()-1;i++)
//      {
//    	  char ch = string.charAt(i);
//    	  dequeue.addFront(ch);
//		  
//      }
//      char ch = dequeue.deleteFront();
//      
	
	}

}
