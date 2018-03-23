package practice;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsomExample2 {

	public static void main(String[] args)
	{
		try 
		{
		FileReader reader = new FileReader("/home/bridgeit/Documents/demo.json");
	
        JSONParser parser = new JSONParser();
	 
	    JSONObject jsobj = (JSONObject) parser.parse(reader);
	  
		String name = (String) jsobj.get("Name");
		String author = (String) jsobj.get("Author");
		JSONArray array = (JSONArray) jsobj.get("Company List");
		Iterator< String> iteartor = array.iterator();
		while(iteartor.hasNext())
		{
			System.out.println(iteartor.next());
		}
		
		System.out.println(name);
		System.out.println(author);
	
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	catch(IOException | ParseException e)
	{
		e.printStackTrace();
	}
	}
	
}
