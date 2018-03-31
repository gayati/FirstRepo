/******************************************************************************
 
  
 *  Purpose: This program is to print the stock report.
 *           
 *  @author  Gayatri Kawade
 *  @version 1.0
 *  @since   
 *
 /******************************************************************************/
package com.bridgelab.ObjectOrientedPrograms;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.bridgelab.Utility.Utility;

public class StockReport {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws IOException, ParseException
	{
     System.out.println("Enter the number of stock");
     int numbers = Utility.readInteger();
     JSONObject jsobj;
     JSONArray array = new JSONArray();
     
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
         array.add(jsobj);
     }
     
      
        
        JSONObject stockobj = new JSONObject();
        stockobj.put("Stock", array);
        System.out.println();
        System.out.println(stockobj.toJSONString());
        System.out.println();
        
        
        FileWriter writer = new FileWriter("Stock.json");
		writer.write(stockobj.toJSONString());
		writer.flush();
		
		
		FileReader file = new FileReader("Stock.json");
		BufferedReader reader = new BufferedReader(file);
		JSONParser parser = new JSONParser();
		JSONObject jsobj1 = (JSONObject) parser.parse(reader);
		JSONArray jsarray = (JSONArray) jsobj1.get("Stock");
		Iterator<Object> iter = jsarray.iterator();
		String sharename = null;
		long sharenumber = 0;
		long shareprice = 0;
		long stockprice=0;
		
		while (iter.hasNext())
		{
		 for(int i=0; i<jsarray.size();i++)
			{  
				JSONObject obj = (JSONObject) iter.next();
				sharename = (String) obj.get("sharename");
		        sharenumber = (long) obj.get("sharenumber");
				shareprice = (long) obj.get("price");
				System.out.println("The price of" + " " + sharename +" "+ "shares: " +  sharenumber*shareprice);
			     stockprice = stockprice + (sharenumber*shareprice);
			}
			
			
		}
		
		System.out.println();
		System.out.println("Stock Price is:" + stockprice);
		
     
	}

}
