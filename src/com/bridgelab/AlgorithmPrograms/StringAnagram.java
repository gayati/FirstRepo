package com.bridgelab.AlgorithmPrograms;

import com.bridgelab.Utility.Utility;

public class StringAnagram {

	public static void main(String[] args) 
	{
		boolean flag = false;
        System.out.println("Enter the first string");
        String inputstring1 = Utility.stringinput();
        System.out.println("Enter the second string");
        String inputstring2 = Utility.stringinput();
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
