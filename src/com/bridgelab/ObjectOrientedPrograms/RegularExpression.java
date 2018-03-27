package com.bridgelab.ObjectOrientedPrograms;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.bridgelab.Utility.Utility;

public class RegularExpression {

	@SuppressWarnings("unused")
	public static void main(String[] args) 
	{
		
		String string = ": Hello <<name>>, We have your full\n" + 
				"name as <<full name>> in our system. your contact number is 91­xxxxxxxxxx.\n" + 
				"Please,let us know in case of any clarification Thank you BridgeLabz 01/01/2016.";
		System.out.println("Enter the name:");
		String inputname = Utility.readString();
		System.out.println("Enter your full name:");
		String fullname = Utility.readString();
		System.out.println("Enter the mobile number:");
		String mobilenumber = Utility.readString();
		System.out.println("Enter the date:");
		String date = Utility.readString();
		
	     String namepattern ="^[a-zA-Z\\s]+";
	     String mobilepattern = "(0/91)?[7-9][0-9]{9}";
	     String datepattern = "^[0-3]?[0-9]/[0-3]?[0-9]/(?:[0-9]{2})?[0-9]{2}$" ;
	     		
	     //boolean isValidMobile = Pattern.matches(mobilepattern, "9860616030");                 
	     Pattern pattern = Pattern.compile(mobilepattern);
	     Matcher matcher = pattern.matcher(mobilenumber);
	     Pattern pattern1 = Pattern.compile(namepattern);
	     Matcher matcher1 = pattern1.matcher(fullname);
	     Pattern pattern2 = Pattern.compile(datepattern);
	     Matcher matcher2 = pattern2.matcher(date);
	     //System.out.println(matcher2);
	     String name1 = null;
	     String fullname1 = null;
	     String mobilenumber1 = null;
	     String date1 = null;
	     if(matcher.matches() && matcher.group().equals(mobilenumber) )
	     {
	      
		  mobilenumber1=matcher.replaceAll(mobilenumber);
		  System.out.println(mobilenumber1);
		
	     }
	     else
	     {

	    	 System.out.println("Please eneter proper mobilenumber");
	     }
	     if(matcher1.matches())
	     {
	    	  name1 = matcher1.replaceAll(fullname);
	    	  System.out.println(name1);
	     }
	     else
	     {
	    	 System.out.println("Please eneter proper name");
	     }
	    
	     if(matcher2.matches())
	     {
	    	  date1 = matcher2.replaceAll(date);
	    	  System.out.println(date1);
	     }
	     else
	     {
	    	 System.out.println("Please eneter proper date");
	     }
	     
	     if(matcher.matches() && matcher1.matches() && matcher2.matches())
	     {
	    	 mobilenumber1=matcher.replaceAll(mobilenumber);
	    	 fullname1 =matcher1.replaceAll(inputname);
	    	
	    	 name1 = matcher1.replaceAll(fullname);
	    	 date1 = matcher2.replaceAll(date);
	        System.out.println( ": Hello"  + " "+name1 + " "+", We have your full" + 
			"name as" + " " +fullname1 +" "+ "in our system. your contact number is" + " "+ mobilenumber1  +" "+ 
			"Please,let us know in case of any clarification Thank you BridgeLabz " +" "+ date1);
	     }
	}

}
