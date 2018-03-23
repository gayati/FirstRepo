package com.bridgelab.ObjectOrientedPrograms;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class InventoryManagement 
{

	public static void main(String[] args) throws IOException, ParseException 
	{
     JSONParser parser = new JSONParser();
     FileReader reader = new FileReader("/home/bridgeit/Documents/MyJsonFiles/Inventory.json");
     JSONObject jsobj = (JSONObject) parser.parse(reader);
     JSONArray jsarray = (JSONArray) jsobj.get("Wheat");
     Iterator<Object> iteartor = jsarray.iterator();
     System.out.println("Details of wheat is as follows:");
     System.out.println();
		while(iteartor.hasNext())
		{
		for(int i=0;i<jsarray.size();i++)
		{   System.out.println(iteartor.next());
			JSONObject wheat = (JSONObject) jsarray.get(i);
			long wheatprice =  (long) wheat.get("price");
			long wheatweigth = (long) wheat.get("weight");
			String type = (String)wheat.get("name");
			System.out.println("The total price for" + " " + type + " "+ " type wheat is:" +(wheatprice*wheatweigth));
			System.out.println();
		}
		}
	 System.out.println();
     System.out.println("Deatails of pulses:");
     JSONArray jsarray1 =(JSONArray) jsobj.get("Pulses");
     Iterator<Object> iteartor1 = jsarray1.iterator();
     while(iteartor1.hasNext())
		{
			System.out.println(iteartor1.next());
			for(int i=0;i<jsarray1.size();i++)
			{   System.out.println(iteartor1.next());
				JSONObject pulses = (JSONObject) jsarray1.get(i);
				long pulseprice =  (long) pulses.get("price");
				long pulseweigth = (long) pulses.get("weight");
				String type = (String)pulses.get("name");
				System.out.println("The total price for" + " " + type + " "+ " type pulse is:" +(pulseprice*pulseweigth));
				System.out.println();
			}
		}
	}

}
