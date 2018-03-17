package com.bridgelab.Datastructure;

import com.bridgelab.Utility.Utility;

public class BalancedParantheses {

	public static void main(String[] args) 
	{
     MyStack stack = new MyStack();
    System.out.println("Enter the expression");
     String expression = Utility.stringinput();
    if (Utility.isParanthesesBalance(expression))
     {
    	 System.out.println("Balanced");
     }
     else
     {
    	 System.out.println("Not Balanced");
     }
     
	}

}
