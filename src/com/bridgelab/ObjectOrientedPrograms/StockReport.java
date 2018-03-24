package com.bridgelab.ObjectOrientedPrograms;

import org.json.simple.JSONObject;

import com.bridgelab.Utility.Utility;

public class StockReport {

	public static void main(String[] args)
	{
     System.out.println("Enter the number of share");
     int numbers = Utility.readInteger();
     JSONObject jsobj;
     for(int i=0;i<numbers;i++)
     {   
    	 jsobj =new JSONObject();
    	 System.out.println("Enter the names of shares");
    	 String companyname = Utility.readString();
    	 jsobj.put("sharename", companyname);
    	 System.out.println("Enter the number of shares");
         int sharenumbers = Utility.readInteger();
         jsobj.put("sharenumber", sharenumbers);
         System.out.println("Enter the shares price");
         int shareprice = Utility.readInteger();
         jsobj.put("price", shareprice);
         System.out.println(jsobj.toJSONString());
     }
     
     
	}

}
