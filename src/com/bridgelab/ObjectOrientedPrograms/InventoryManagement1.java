package com.bridgelab.ObjectOrientedPrograms;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.bridgelab.Utility.Utility;

public class InventoryManagement1 {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws IOException, ParseException
	{
		System.out.println("Enter the number of varities of wheat varieties you want to add:");
		int wheatitems = Utility.readInteger();
		
		JSONObject obj;
		JSONArray wheatarr = new JSONArray();
		for(int i=0;i<wheatitems;i++)
		{
			
		    obj = new JSONObject();
			System.out.println("Enter the name of item:");
			String name = Utility.readString();
			obj.put("type", name);
			System.out.println("Enter the price of item:");
			int price = Utility.readInteger();
			obj.put("price", price);
			System.out.println("Enter the weigth  of item:");
			int weight = Utility.readInteger();
			obj.put("weight", weight);
			wheatarr.add(obj);
			
		}
//		JSONObject wheatobj = new JSONObject();
//		for(int i=0;i<wheatarr.size();i++)
//		{
//		   wheatobj.put("wheat", wheatarr);
//			
//		}
		
		JSONArray pulsearr = new JSONArray();

		System.out.println("Enter the number of pulses varieties you want to add:");
		int pulseitems = Utility.readInteger();
		
		for(int i=0;i<pulseitems;i++)
		{
			
		    obj = new JSONObject();
			System.out.println("Enter the name of item:");
			String name = Utility.readString();
			obj.put("type", name);
			System.out.println("Enter the price of item:");
			int price = Utility.readInteger();
			obj.put("price", price);
			System.out.println("Enter the weigth  of item:");
			int weight = Utility.readInteger();
			obj.put("weight", weight);
			pulsearr.add(obj);
			
		}
//		JSONObject pulsetobj = new JSONObject();
//		for(int i=0;i<pulsearr.size();i++)
//		{
//			pulsetobj.put("pulse", pulsearr);
//			
//		}
		
		
		JSONObject varities = new JSONObject();
		varities.put("wheat",wheatarr);
		varities.put("pulse", pulsearr);
		
		FileWriter writer = new FileWriter("/home/bridgeit/Documents/MyJsonFiles/Inventory.json");
		BufferedWriter bw = new BufferedWriter(writer);
		System.out.println(varities);
		//writer.write(wheatobj.toJSONString());
	//	writer.write(pulsetobj.toJSONString());
		writer.write(varities.toJSONString());
		writer.flush();
		//System.out.println(wheatobj);
		//System.out.println(pulsetobj);
		
		 JSONParser parser = new JSONParser();
	     FileReader reader = new FileReader("/home/bridgeit/Documents/MyJsonFiles/Inventory.json");
	     JSONObject jsobj = (JSONObject) parser.parse(reader);
	     JSONArray jsarray = (JSONArray) jsobj.get("wheat");
	     Iterator<Object> iteartor = jsarray.iterator();
	     
	     System.out.println();
	     System.out.println("Details of wheat is as follows:");
	    
			while(iteartor.hasNext())
			{
			for(int i=0;i<jsarray.size();i++)
			{   
				System.out.println(iteartor.next());
				JSONObject wheat = (JSONObject) jsarray.get(i);
				long wheatprice =  (long) wheat.get("price");
				long wheatweigth = (long) wheat.get("weight");
				String type = (String)wheat.get("type");
				System.out.println("The total price for" + " " + type + " "+ " type wheat is:" +(wheatprice*wheatweigth));
				System.out.println();
			}
			}
			
		 System.out.println();
	     System.out.println("Deatails of pulses:");
	     JSONArray jsarray1 =(JSONArray) jsobj.get("pulse");
	     Iterator<Object> iteartor1 = jsarray1.iterator();
	     while(iteartor1.hasNext())
			{
				for(int i=0;i<jsarray1.size();i++)
				{  
					System.out.println(iteartor1.next());
					JSONObject pulses = (JSONObject) jsarray1.get(i);
					long pulseprice =  (long) pulses.get("price");
					long pulseweigth = (long) pulses.get("weight");
					String type = (String)pulses.get("type");
					System.out.println("The total price for" + " " + type + " "+ " type pulse is:" +(pulseprice*pulseweigth));
					System.out.println();
				}
			}
	}

}
