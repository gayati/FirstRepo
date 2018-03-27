package com.bridgelab.ObjectOrientedPrograms;



import java.io.IOException;

import org.json.simple.parser.ParseException;

import com.bridgelab.Utility.Utility;

public class StockAccount {

	public static void main(String[] args) throws IOException, ParseException
	{   int input;
	
	
		 do {
		System.out.println("1.Open Account: ");
		System.out.println("2.Buy: ");
		System.out.println("3.Sell: ");
		System.out.println("4.Display Report: ");
		System.out.println("Enter your choice");
		int choice = Utility.readInteger();
		switch (choice) {
		case 1: Utility.Stockaccount();
		        break;
			
        case 2:Utility.buy();
               break;
			
        case 3:Utility.sell();
    	       break;
		
       case 4:
			
			break;
			
		default:
			break;
		}
		System.out.println("Do you want to continue?[Y/N]");
	    input=Utility.readChar();
		 }
		while((input!='n')&&(input!='N'));

	}

}
