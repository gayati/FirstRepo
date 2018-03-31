/******************************************************************************
 
  
 *  Purpose: 
 *           
 *  @author  Gayatri Kawade
 *  @version 1.0
 *  @since   06-08-2017
 *
 /******************************************************************************/
package com.bridgelab.Datastructure;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

import com.bridgelab.Utility.Utility;
public class OrderdList {

	public static void main(String[] args)
	{
		MyLinkedList<Integer> list = new MyLinkedList<>();

		Integer[] intArray = null;
		String filePath = "/home/bridgeit/Documents/myfile1.txt";
		try
		{
		FileReader file = new FileReader(filePath);
		BufferedReader reader = new BufferedReader(file);
		String line = reader.readLine();
		reader.close();
		String[] array = line.split(" ");
		intArray= new Integer[array.length];
		for(int i=0; i<intArray.length;i++)
		{
			String numString = array[i];
			intArray[i] = Integer.parseInt(numString);
		}
		
		
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println();
        Utility.bubbleSort(intArray);
      
        for(int i=0; i<intArray.length; i++)
        {
        	list.insert(intArray[i]);
        }
        System.out.println("Numbers are added in the list");
        list.show();
        
        
        
        
        System.out.println("Enter the number to search:");
        int number = Utility.readInteger();
      
        
        int index= list.indexOf(number);
                   
		boolean flag = list.search(list.head, number);
        
        if(flag==true)
        {
        	System.out.println("Found");
        	list.deleteAt(index);
        }
        else
        {
         System.out.println("Not found");
         list.insert(number);
        }
        
        Utility.writeFile(filePath, list);
        
		

	}

}