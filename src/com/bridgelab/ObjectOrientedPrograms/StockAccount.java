/******************************************************************************
 
  
 *  Purpose: 
 *           
 *  @author  Gayatri Kawade
 *  @version 1.0
 *  @since   06-08-2017
 *
 /******************************************************************************/
package com.bridgelab.ObjectOrientedPrograms;



import java.io.IOException;

import org.json.simple.parser.ParseException;

import com.bridgelab.Utility.Utility;

public class StockAccount {

	public static void main(String[] args) throws IOException, ParseException
	{   int input;
	
	
		 do {
		System.out.println("1.Open Account ");
		System.out.println("2.Buy ");
		System.out.println("3.Sell ");
	
		System.out.println("Enter your choice");
		int choice = Utility.readInteger();
		switch (choice) {
		case 1: Utility.Stockaccount();
		        break;
			
        case 2:Utility.buy();
               break;
			
        case 3:Utility.sell();
    	       break;
		
       
			
		default:System.out.println("Invalid Choice");
			break;
		}
		System.out.println("Do you want to continue?[Y/N]");
	    input=Utility.readChar();
		 }
		while((input!='n')&&(input!='N'));

	}

}
