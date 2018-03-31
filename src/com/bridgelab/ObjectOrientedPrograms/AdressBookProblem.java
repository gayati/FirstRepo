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

public class AdressBookProblem {

	public static void main(String[] args) throws IOException, ParseException
	{
		 
		 char input;
		 do {
	
		
		System.out.println("********Address Book*******");
		System.out.println("1.Add Pesron Details");
		System.out.println("2.Edit the details");
		System.out.println("3.Delete the person");
		System.out.println("4.Sort Details");
		System.out.println("5.Display Persons Details");
		System.out.println("******************************");
		
		int choice = Utility.readInteger();
		switch (choice) {
		case 1:Utility.addPersonDetails();
			   break;
		case 2:Utility.editPersonDeatils();
		       break;
		       
		case 3:Utility.deletePersonDetails();
	           break;
	       
		case 4:Utility.sortPersonDetails();
	          break;
	   
	       
	 	case 5:Utility.displayPersonDetails();
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
