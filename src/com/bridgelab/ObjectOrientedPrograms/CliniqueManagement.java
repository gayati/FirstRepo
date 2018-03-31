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

public class CliniqueManagement {

	public static void main(String[] args) throws IOException, ParseException, java.text.ParseException
	{   
		 char input;
		 do {
	
		System.out.println("1.Add Doctors Details");
		System.out.println("2.Add Patient Details");
		System.out.println("3.Display Doctor Details");
		System.out.println("4.Display Patient Details");
		System.out.println("5.Search Doctor");
		System.out.println("6.Search Patient");
		System.out.println("7.Take Appoinments");
		System.out.println("8.Print Appoinments");
	
		System.out.println("Enter your choice: ");
		int choice = Utility.readInteger();
		
		
		switch (choice) {
		case 1:Utility.addDoctorsDetails();
		
			   break;
		case 2:Utility.addPatientDetails();
		       break;
		       
		case 3:Utility.displayDoctorsDetails();
	           break;
	       
		case 4:Utility.displayPatientDetails();
	          break;
	   
	       
	 	case 5:Utility.searchDoctorDetails();
	 	       break;
	 	       
   
	 	case 6:Utility.searchPatientDetails();
		 	   break;
		 	   
	 	case 7:Utility.takeAppointment();
	 	   break;
	 	   
	 	case 8:Utility.printAppointment();
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


