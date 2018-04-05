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

public class StockLinkedList {

	public static void main(String[] args) throws IOException, ParseException
	{
		
		System.out.println("1.Add Shares: ");
		System.out.println("2.Remove Shares: ");
		int choice = Utility.readInteger();
		switch (choice) {
		case 1:Utility.addShares();
			   break;
		case 2:Utility.removeShares();
		       break;
		default:System.out.println("Invalid Choice");
			    break;
		}
	
		
	    
	    

	}

}
